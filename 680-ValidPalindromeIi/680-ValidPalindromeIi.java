// Last updated: 8/12/2026, 12:31:53 PM
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPal(s, left + 1, right) || isPal(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPal(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}