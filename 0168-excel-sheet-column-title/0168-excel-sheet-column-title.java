class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while (columnNumber>0){
            int r=columnNumber%26;
            if(columnNumber%26==0)
                r=26;
            ans=(char)(r+64)+ans;
            System.out.println(r+" "+ans+" "+columnNumber);
            columnNumber=columnNumber/26;
            if(r==26)
                columnNumber--;
            
        }return ans;
        
        
    }
}