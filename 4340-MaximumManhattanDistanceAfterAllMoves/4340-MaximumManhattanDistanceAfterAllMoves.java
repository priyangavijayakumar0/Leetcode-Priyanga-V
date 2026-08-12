// Last updated: 8/12/2026, 12:28:39 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int z=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
        char ch =moves.charAt(i);
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='L'){
                x--;
            
            }else if(ch=='R'){
                x++;
            }
            else if(ch=='_'){
                z++;
            }
        
            }  
        return Math.abs(x)+Math.abs(y)+z;
    }
}