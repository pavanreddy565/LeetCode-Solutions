class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min=Integer.MAX_VALUE,  neg=0;
        long sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0) neg++;
                int val = Math.abs(matrix[i][j]);
                if(min>val) min = val;
                sum+=val;
            }
            
        }System.out.println(neg+" "+min);
        if((neg %2 )== 1) sum-= 2*min;
        return sum;
    }
}