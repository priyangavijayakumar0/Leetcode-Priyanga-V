// Last updated: 8/12/2026, 12:31:26 PM
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stS = new Stack<>();
        Stack<Character> stT = new Stack<>();

    
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stS.push(c); 
            } else if (!stS.isEmpty()) {
                stS.pop();    
            }
        }

        
        for (char c : t.toCharArray()) {
            if (c != '#') {
                stT.push(c); 
            } else if (!stT.isEmpty()) {
                stT.pop();    
            }
        }


        return stS.equals(stT);
    }
}
