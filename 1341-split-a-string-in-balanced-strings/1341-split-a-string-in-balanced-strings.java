class Solution {
    public int balancedStringSplit(String s) {
        int count=0,stack=0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='L') stack++;
            else stack--;
            if(stack==0) count++;
        }return count;
    }
}