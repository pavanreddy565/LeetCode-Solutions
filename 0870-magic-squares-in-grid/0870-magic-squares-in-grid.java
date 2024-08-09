class Solution {
    void print(int[][] arr,int r_start,int c_start){
        int n=arr.length,m=arr[0].length;
        for(int i=r_start;i<r_start+3;i++){
            for(int j=c_start;j<c_start+3;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }System.out.println('m');
        // for(int j=c_start;j<c_start+3;j++){
        //     for(int i=r_start;i<r_start+3;i++){
        //         System.out.print(arr[i][j]+" ");
        //     }System.out.println();
        // }
    }
    boolean magic_(int[][] magic,int r_start,int c_start){
        int prev_row=0,dia1=0,dia2=0;
        if(magic.length==1)
            return false;
        //this.print(magic,r_start,c_start);
        int total[]=new int[9];
        for(int i=r_start;i<r_start+3;i++){
            int row_total=0;
            for(int j=c_start;j<c_start+3;j++){
                if(magic[i][j]>9||magic[i][j]<1){
                    return false;
                }
                total[magic[i][j]-1]=1;
                row_total+=magic[i][j];
                //System.out.println(i+" "+j);
                if(i+c_start==j+r_start){
                    dia1+=magic[i][j];
                }
                if(i+j-c_start-r_start==2){
                    dia2+=magic[i][j];
                }
            }if(i!=r_start && prev_row!=row_total){
                // System.out.println('r');
                return false;
            }
            prev_row=row_total;
            
        }
        int sum=0;
        for(int i=0;i<9;i++)
            sum+=total[i];
        if(sum!=9){
            // System.out.println('s');
            return false;
        }
        for(int j=c_start;j<c_start+3;j++){
            int col_total=0;
            for(int i=r_start;i<r_start+3;i++){
                col_total+=magic[i][j];
            }if(col_total!=prev_row){
                //System.out.println('c');
                return false;
            }
        }
        if(dia1!=dia2 || dia1!=prev_row){
            //System.out.println("dia1 "+dia1+"dia2 "+dia2);
            return false;
        }return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length,m=grid[0].length,count=0;
        //System.out.println(n+" "+m);
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                System.out.println(this.magic_(grid,i,j));
                if(this.magic_(grid,i,j))
                    count++;
            }
        }return count;

    }
}