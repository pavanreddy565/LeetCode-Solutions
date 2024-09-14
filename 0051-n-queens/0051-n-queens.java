class Solution {
    List<String> construct(char[][]board){
        int n=board.length;
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<n;i++)
            ans.add(new String(board[i]));
        return ans;
    }
    void solve(int col,char[][]board,List<List<String>>res,int[] leftRow,int[]upper,int[]lower){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        int n= board.length;
        for(int row=0;row<board.length;row++){
            if(leftRow[row]==0&& upper[row + col] == 0 && lower[col - row + (n - 1)] == 0){
                board[row][col]='Q';
                leftRow[row]=1;
                upper[(col+row)]=1;
                lower[col-row+n-1]=1;
                solve(col+1,board,res,leftRow,upper,lower);
                board[row][col]='.';
                leftRow[row]=0;
                upper[(col+row)]=0;
                lower[col-row+n-1]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }int[] leftRow=new int[n];
        int [] upper = new int[2*n-1];
        int [] lower = new int [2*n-1];
        List<List<String>> res=new ArrayList<>();
        solve(0,board,res,leftRow,upper,lower);
        return res;
    }
}