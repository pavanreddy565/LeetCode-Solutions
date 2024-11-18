class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        if(k==0) return new int[n];
        int[] ans = new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<i+k+1;j++){
                    ans[i]+=code[j%n];
                }
            }
        }else{
            for(int i=0;i<n;i++){
                for(int j=n+k+i;j<n+i;j++){
                    ans[i]+=code[j%n];
                }
            }
        }return ans;
    }
}