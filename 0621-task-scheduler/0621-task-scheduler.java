class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(!map.containsKey(tasks[i])) map.put(tasks[i],1);
            else map.put(tasks[i],map.get(tasks[i])+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : map.values()) pq.add(-i);
          Queue<int[]> cooldownQueue = new LinkedList<>(); 
        int count = 0;

        while (!pq.isEmpty() || !cooldownQueue.isEmpty()) {
            count++;
            //System.out.println(pq);
            //System.out.println(cooldownQueue);
            if (!cooldownQueue.isEmpty() && cooldownQueue.peek()[1] == count) {
                pq.add(cooldownQueue.poll()[0]);
            }

            
            if (!pq.isEmpty()) {
                int remaining = pq.poll() + 1;
                if (remaining < 0) {
                    cooldownQueue.add(new int[]{remaining, count + n +1}); 
                }
            }
        }

        return count;
    }
}