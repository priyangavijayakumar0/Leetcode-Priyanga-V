// Last updated: 8/12/2026, 12:28:46 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                long absSum=Math.abs(sum);
                long lastdigit=absSum%10;
                long firstdigit=absSum;
                while(firstdigit>=10){
                    firstdigit/=10;
                }
                if(firstdigit== x && lastdigit==x){
                    c++;
                }
            }
        }
        return c;
    }
}