class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // List stack= Arrays.asList(nums);
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--) stack.add(nums[i]);
        for(int i=nums.length-1;i>=0;i--){
            while(stack.size()>0 && stack.get(stack.size()-1)<=nums[i]){
                stack.remove(stack.size()-1);
            }
            if(stack.size()==0){
                stack.add(nums[i]);
                nums[i]=-1;
            }else{
                int temp=stack.get(stack.size()-1);
                stack.add(nums[i]);
                nums[i]=temp;
            }
        }return nums;
    }
}