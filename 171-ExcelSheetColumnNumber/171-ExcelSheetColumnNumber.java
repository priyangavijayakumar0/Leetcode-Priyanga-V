// Last updated: 8/12/2026, 12:35:09 PM
class Solution {
    public int titleToNumber(String col) {
        int res=0;
        for(int i=0;i<col.length();i++){
            char c=col.charAt(i);
            int val=c -'A'+1;
            res=res*26+val;
        }
        return res;
        
    }
}