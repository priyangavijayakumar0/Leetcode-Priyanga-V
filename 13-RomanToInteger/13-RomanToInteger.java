// Last updated: 8/12/2026, 12:37:16 PM
class Solution {
    public int romanToInt(String s) {
        int roman = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 0;

            char ch = s.charAt(i);

            if (ch == 'I')
                curr = 1;
            else if (ch == 'V')
                curr = 5;
            else if (ch == 'X')
                curr = 10;
            else if (ch == 'L')
                curr = 50;
            else if (ch == 'C')
                curr = 100;
            else if (ch == 'D')
                curr = 500;
            else if (ch == 'M')
                curr = 1000;

            if (i < s.length() - 1) {
                int next = 0;
                char ch1 = s.charAt(i + 1);

                if (ch1 == 'I')
                    next = 1;
                else if (ch1 == 'V')
                    next = 5;
                else if (ch1 == 'X')
                    next = 10;
                else if (ch1 == 'L')
                    next = 50;
                else if (ch1 == 'C')
                    next = 100;
                else if (ch1 == 'D')
                    next = 500;
                else if (ch1 == 'M')
                    next = 1000;

                if (curr < next)
                    roman -= curr;
                else
                    roman += curr;
            } else {
                roman += curr;
            }
        }

        return roman;
    }
}