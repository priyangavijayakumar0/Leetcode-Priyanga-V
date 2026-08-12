// Last updated: 8/12/2026, 12:36:31 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String [] word=s.split(" ");
        int n=word.length;
        return word[n-1].length();
        
    }
}