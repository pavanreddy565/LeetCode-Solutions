class Solution {
    public int[][] generateMatrix(int n) {
        int l=0,t=0,b=n-1,r=n-1;
        int rot=1;
        int [][] ans= new int[n][n];
        int num=1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                ans[t][i]=num;
                num++;
            }t++;
            for(int i=t;i<=b;i++){
                ans[i][r]=num;
                num++;
            }r--;
            for(int i=r;i>=l;i--){
                ans[b][i]=num;
                num++;
            }b--;
            for(int i=b;i>=t;i--){
                ans[i][l]=num;
                num++;
            }l++;
            rot++;
        }return ans;
    }
}