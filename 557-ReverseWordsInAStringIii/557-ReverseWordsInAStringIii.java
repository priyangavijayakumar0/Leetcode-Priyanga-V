// Last updated: 8/12/2026, 12:32:20 PM
class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
        
    }
}