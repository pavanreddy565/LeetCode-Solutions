class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length,m=boxGrid[0].length;
        for(int i=0;i<n;i++){
            int r = m-1;
            for(int j = m-1;j>=0;j-- ){
                if(boxGrid[i][j]=='#'){
                    char temp = boxGrid[i][r];
                    boxGrid[i][r] = boxGrid[i][j];
                    boxGrid[i][j] = temp;
                    r--;
                }else if(boxGrid[i][j]=='*'){
                    r = j-1;
                }
            }
        }
        char ans[][] = new char[m][n];
        for(int i =0;i<m;i++){
            int k=0;
            for(int j = n-1; j>=0 && k<n; j--){
                ans[i][k++] = boxGrid[j][i];
            }
        }return ans;
    }
}