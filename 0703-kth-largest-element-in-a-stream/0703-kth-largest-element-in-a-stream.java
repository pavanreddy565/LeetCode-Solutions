import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        // Min-heap with a custom comparator (smallest element at the top)
        this.pq = new PriorityQueue<>();

        // Add all the numbers to the priority queue
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        // Add the new value to the priority queue
        pq.add(val);

        // If the size of the priority queue exceeds k, remove the smallest element
        if (pq.size() > k) {
            pq.poll();
        }

        // The top of the min-heap is the k-th largest element
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
