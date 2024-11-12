class Solution {
    int editArray(String s1,String s2,int n1,int n2){
        int[][] ans = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0){
                    ans[i][j]=j;
                }else if(j==0){
                    ans[i][j]=i;
                }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }else{
                    int r_=Math.min(ans[i-1][j],ans[i][j-1]);
                    ans[i][j]=1+Math.min(r_,ans[i-1][j-1]);
                }
            }
        }//print(ans,n1,n2);
        return ans[n1][n2];
    }
    public int minDistance(String word1, String word2) {
        return editArray(word1,word2,word1.length(),word2.length());
    }
}