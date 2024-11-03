

class LFUCache {
    class Node {
        int key, value, frequency;
        Node(int k, int v) {
            key = k;
            value = v;
            frequency = 1;
        }
    }

    private final int capacity;
    private int minFrequency;
    private HashMap<Integer, Node> cache; // key -> Node
    private HashMap<Integer, LinkedHashSet<Node>> frequencyMap; // frequency -> nodes with this frequency

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        cache = new HashMap<>();
        frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) return -1;

        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (cache.size() == capacity) {
                evictLFU();
            }

            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            minFrequency = 1;
            frequencyMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
        }
    }

    private void updateFrequency(Node node) {
        int freq = node.frequency;
        frequencyMap.get(freq).remove(node);

        if (frequencyMap.get(freq).isEmpty()) {
            frequencyMap.remove(freq);
            if (minFrequency == freq) {
                minFrequency++;
            }
        }

        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency, k -> new LinkedHashSet<>()).add(node);
    }

    private void evictLFU() {
        LinkedHashSet<Node> nodes = frequencyMap.get(minFrequency);
        Node nodeToRemove = nodes.iterator().next();
        nodes.remove(nodeToRemove);
        if (nodes.isEmpty()) {
            frequencyMap.remove(minFrequency);
        }
        cache.remove(nodeToRemove.key);
    }
}
