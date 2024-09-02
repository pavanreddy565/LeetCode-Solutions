class Solution {
    List<String> parenthesis(char[] ans,int pos,int n, int open,int close, List<String> sol){
        if(close==n){
            sol.add(new String(ans));
            return sol;
        }
        if(open>close){
            ans[pos]=')';
            sol=this.parenthesis(ans,pos+1,n,open,close+1,sol);
        }if(open<n){
            ans[pos]='(';
            sol=this.parenthesis(ans,pos+1,n,open+1,close,sol);
        }return sol;
    }
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        char[] ans= new char[2*n];
        return this.parenthesis(ans,0,n,0,0,arr);
    }
}