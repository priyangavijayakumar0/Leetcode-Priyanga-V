// Last updated: 8/12/2026, 12:32:57 PM
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();

        for (char ch : num.toCharArray()) {

            while (k > 0 &&
                   stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch) {

                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(ch);
        }

        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        while (stack.length() > 0 && stack.charAt(0) == '0') {
            stack.deleteCharAt(0);
        }

        if (stack.length() == 0) {
            return "0";
        }

        return stack.toString();
        
    }
}