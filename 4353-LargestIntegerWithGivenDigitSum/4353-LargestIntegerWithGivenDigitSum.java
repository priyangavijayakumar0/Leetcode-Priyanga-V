// Last updated: 8/12/2026, 12:28:33 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        if(s>9*n){
            return -1;
        }
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<n;i++){
            int digit=Math.min(9,s);
            ans.append(digit);
            s-=digit;
        }
        
        return 
            Integer.parseInt(ans.toString());
    }
}