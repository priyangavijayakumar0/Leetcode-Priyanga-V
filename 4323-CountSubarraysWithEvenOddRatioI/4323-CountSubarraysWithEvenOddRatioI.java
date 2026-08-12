// Last updated: 8/12/2026, 12:28:40 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int even=0;
            int odd=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0)
                    even++;
                else
                    odd++;
                if(odd>0 && even*b<=odd*a){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}