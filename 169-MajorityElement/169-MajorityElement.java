// Last updated: 8/12/2026, 12:35:13 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            t=nums[i];
            if(t==nums[i])
            c++;
            else
            c--;            
        }
        return t;
    }
}