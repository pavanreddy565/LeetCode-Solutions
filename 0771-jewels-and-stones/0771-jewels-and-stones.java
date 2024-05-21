class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap();
        for(char i : stones.toCharArray()){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }int sum=0;
        for(char i : jewels.toCharArray()){
            if(map.containsKey(i)){
                sum+=map.get(i);
            }
        }return sum;
    }
}
