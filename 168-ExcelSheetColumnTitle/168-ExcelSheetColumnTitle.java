// Last updated: 8/12/2026, 12:35:16 PM
class Solution {
    public String convertToTitle(int col) {
        StringBuilder res=new StringBuilder();
        while(col>0){
            col--;
            int rem=col%26;
            char letter=(char)('A'+rem);
            res.insert(0,letter);
            col/=26;
        }
         
        return res.toString();
    }
}