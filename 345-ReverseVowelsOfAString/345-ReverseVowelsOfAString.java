// Last updated: 8/12/2026, 12:33:11 PM
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        
        while (l < r) {
            while (l < r && !vowels.contains(chars[l])) l++;
            while (l < r && !vowels.contains(chars[r])) r--;
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++; r--;
        }
        return new String(chars);
        
    }
}