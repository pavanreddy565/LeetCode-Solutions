class Solution {
    public int HistoArea(int[] histo){
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public int maximalRectangle(char[][] matrix) {
        int max_=0;
        int []arr = new int[matrix[0].length];
        //print(arr);
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                int num=matrix[i][j];
                arr[j]+=num - '0';
                //print(arr);
                if(matrix[i][j]=='0') arr[j]=0;
            }//print(arr);
            int m=HistoArea(arr);
            //System.out.println(m);
            max_=Math.max(max_,m);
        }return max_;
    }
}