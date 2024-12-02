class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
         if(hand.length%groupSize !=0) return false;
         HashMap<Integer,Integer> map = new HashMap<>();
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i : hand){
            if(! map.containsKey(i)){
                map.put(i,1);
                pq.add(i);
            }else{
                map.put(i, map.get(i)+1);
            }
         }
         while(pq.size()>0){
            int minH=pq.peek();
           // System.out.println(minH);
            for(int i=minH;i<minH+groupSize;i++){
                if(! map.containsKey(i)) return false;
                else{
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0){
                        //System.out.println(i+" "+minH);
                        if(i!=pq.peek()) return false;
                        pq.poll();
                        
                    }
                }
            }
         }return true;
    }
}