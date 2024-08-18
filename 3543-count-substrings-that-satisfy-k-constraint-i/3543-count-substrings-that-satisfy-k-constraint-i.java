class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int ones=0,zeros=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1')
                    ones++;
                if(s.charAt(j)=='0')
                    zeros++;
                
                if(zeros>k && ones >k)
                    break;
                //System.out.println(i+" "+j+" "+zeros+ " "+ones+" "+count);
                count++;
            }
        }return count;
    }
}