class Solution {
    void combo(int inde,int k, int n,List<List<Integer>>ans, List<Integer> ds){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }if (n==0){
            return;
        }
        if(inde <10){
            if(k>0){
                ds.add(inde);
                combo(inde+1,k-1,n-inde,ans,ds);
                ds.remove(ds.size() - 1);
            }
            combo(inde+1,k,n,ans,ds);

        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        combo(1,k,n,ans,ds);
        return ans;

    }
}