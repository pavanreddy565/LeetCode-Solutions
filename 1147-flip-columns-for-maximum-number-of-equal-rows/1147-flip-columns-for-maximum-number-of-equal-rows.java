class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<matrix.length;i++){
            char[] ans = new char[matrix[i].length];
            boolean flip = matrix[i][0] == 0;
            for(int j=0;j<matrix[i].length;j++){
                if(flip){ 
                    ans[j] = (char) ('0' + matrix[i][j]);
                }else{
                    ans[j] = (char)('0' + (1 - matrix[i][j]));;
                }
            }String key = new String(ans);
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
        }int max_=Integer.MIN_VALUE;
        for(HashMap.Entry<String,Integer> i: map.entrySet()){
            max_=Math.max(i.getValue(),max_);
        }return max_;
    }
}