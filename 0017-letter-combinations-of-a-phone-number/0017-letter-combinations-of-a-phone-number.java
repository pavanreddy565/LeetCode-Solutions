class Solution {
    void combo(int ind, String digits, HashMap<Character,String> map, String s, List<String> ans){
        if(digits.length()==0){
            return;
        }
        if(ind==digits.length()){
            ans.add(s);
            return;
        }String exp=map.get(digits.charAt(ind));
        for(int i=0;i<exp.length();i++){
            combo(ind+1,digits,map,s+exp.charAt(i),ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map =new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans = new ArrayList<>();
        combo(0,digits,map,"",ans);
        return ans;
    }
}