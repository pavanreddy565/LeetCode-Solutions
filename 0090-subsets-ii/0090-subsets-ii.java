class Solution {
    void combo(int ind,int[] nums,List<Integer>ds,List<List<Integer>>ansList){
        ansList.add(new ArrayList<>(ds)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            combo(i+1, nums, ds, ansList); 
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        combo(0,nums,out,ans);
        return ans;

    }
}