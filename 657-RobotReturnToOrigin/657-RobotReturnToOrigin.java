// Last updated: 8/12/2026, 12:31:57 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')
               y++;
            else if(ch=='D')
                y--;
            else if(ch=='L')
                x--;
            else if(ch=='R')
                x++;
            
            
        }
        return x==0 && y==0;
        
    }
}