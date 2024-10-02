class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []ans=arr.clone();
        Arrays.sort(ans);
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=1;
        for(int i=0;i<ans.length;i++){
            if(!map.containsKey(ans[i])){
                map.put(ans[i],num);
                num++;
            }
                
        }for(int i=0;i<ans.length;i++){
            ans[i]=map.get(arr[i]);
        }return ans;

    }
}