// Last updated: 8/12/2026, 12:29:19 PM
class Solution {
    public int vowelStrings(String[] words, int left, int right){
        String vowels = "aeiou";
        int count = 0;
        for (int i = left; i <= right; i++) {
            String w = words[i];
            if (vowels.indexOf(w.charAt(0)) != -1 &&
                vowels.indexOf(w.charAt(w.length() - 1)) != -1) {
                count++;
            }
        }
        return count;

        
    }
}