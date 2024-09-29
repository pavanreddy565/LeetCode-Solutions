class Solution {
    void print(int[][] ch){
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[0].length;j++){
                System.out.print(ch[i][j]+" ");
            }System.out.println("end");
        }
    }
    public String convert(String s, int numRows) {
        int[][] ch = new int[numRows][s.length()];
        int i=0,j=0;
        if (numRows==1) return s;
        for(int k=0;k<s.length();k++){
            ch[i][j]=k;
            if(j%(numRows-1)==0&&i<numRows-1){
                i++;
            }else{
                j++;
                i--;
            }
        }
        char[] ans = new char[s.length()];
        int m=1;
        ans[0]=s.charAt(0);
        for(int p=0;p<ch.length;p++){
            for(int q=0;q<ch[0].length;q++){
                if(ch[p][q]!=0){
                    //System.out.println(ch[p][q]+" "+s.charAt(ch[p][q]));
                    ans[m]=s.charAt(ch[p][q]);
                    m++;
                }
            }
        }
        return new String(ans);
    }
}