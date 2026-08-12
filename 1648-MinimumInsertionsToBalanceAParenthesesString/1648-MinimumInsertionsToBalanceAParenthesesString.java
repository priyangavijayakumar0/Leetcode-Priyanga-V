// Last updated: 8/12/2026, 12:29:59 PM
class Solution {
    public int minInsertions(String s) {
         int ans = 0;
        int need = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                need += 2;
                if (need % 2 == 1) {
                    ans++;
                    need--;
                }
            } else {
                need--;
                if (need == -1) {
                    ans++;
                    need = 1;
                }
            }
        }
        return ans + need;

        
    }
}