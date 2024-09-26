class Solution {
    String convertString(List<Character> sb) {
        char[] arr = new char[sb.size()];
        for (int i = 0; i < sb.size(); i++) {
            arr[i] = sb.get(i);
        }
        return new String(arr);
    }

    public void find(int ind, String num, int target, long tar, long prevNum, List<String> ans, List<Character> sb) {
        if (ind == num.length()) {
            if (tar == target) {
                ans.add(convertString(sb));
            }
            return;
        }

        for (int i = ind; i < num.length(); i++) {
            if (i > ind && num.charAt(ind) == '0') {
                break;  // Avoid leading zeros
            }

            String part = num.substring(ind, i + 1);
            long currNum = Long.parseLong(part);
            int sbSize = sb.size();  // Store the current size for backtracking

            // First digit, no operator
            if (ind == 0) {
                sb.addAll(toCharList(part));
                find(i + 1, num, target, currNum, currNum, ans, sb);
                sb.subList(sbSize, sb.size()).clear();  // Backtrack
            } else {
                // + operation
                sb.add('+');
                sb.addAll(toCharList(part));
                find(i + 1, num, target, tar + currNum, currNum, ans, sb);
                sb.subList(sbSize, sb.size()).clear();  // Backtrack

                // - operation
                sb.add('-');
                sb.addAll(toCharList(part));
                find(i + 1, num, target, tar - currNum, -currNum, ans, sb);
                sb.subList(sbSize, sb.size()).clear();  // Backtrack

                // * operation
                sb.add('*');
                sb.addAll(toCharList(part));
                find(i + 1, num, target, tar - prevNum + (prevNum * currNum), prevNum * currNum, ans, sb);
                sb.subList(sbSize, sb.size()).clear();  // Backtrack
            }
        }
    }

    // Helper to convert string to list of characters
    private List<Character> toCharList(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        return list;
    }

    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        find(0, num, target, 0, 0, ans, new ArrayList<>());
        return ans;
    }
}
