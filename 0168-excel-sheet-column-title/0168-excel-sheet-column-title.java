class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            int r = columnNumber % 26;
            if (r == 0) r = 26;
            ans.insert(0, (char)(r + 64)); 
            
            columnNumber = (columnNumber - r) / 26; 
        }
        return ans.toString();
    }
}
