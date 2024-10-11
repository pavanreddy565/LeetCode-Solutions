class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> stack = new ArrayList<>();

        for(int i=nums2.length-1;i>=0;i--){
            // System.out.println(nums2[i]);
            while((stack.size()>0 && stack.get(stack.size()-1)<nums2[i])){
                stack.remove(stack.size()-1);
            }
            
            if(stack.size()>0 && stack.get(stack.size()-1)>nums2[i]){
                map.put(nums2[i],stack.get(stack.size()-1));
                stack.add(nums2[i]);
            }if(stack.size()==0){
                map.put(nums2[i],-1);
                stack.add(nums2[i]);
            }
        }
        System.out.println(map);
        for(int i=0;i<nums1.length;i++){
            // nums1[i]=map.get(nums1[i]);
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }else{
                nums1[i]=-1;
            }
        }return nums1;
    }
}