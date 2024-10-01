class Solution {
    int count(int num){
        int co=0;
        while(num>0){
            co++;
            num=num&(num-1);
        }return co;
    }
    public int minBitFlips(int start, int goal) {
        int num= start^goal;
        System.out.println(num);
        return count(num);
    }
}