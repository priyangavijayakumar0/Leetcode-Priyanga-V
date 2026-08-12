// Last updated: 8/12/2026, 12:37:04 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
                return result;
    }
    public void generate(List<String> result, String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }
        if (open < n) {
            generate(result, s + "(", open + 1, close, n);
        }
                if (close < open) {
            generate(result, s + ")", open, close + 1, n);
        }
    }



}