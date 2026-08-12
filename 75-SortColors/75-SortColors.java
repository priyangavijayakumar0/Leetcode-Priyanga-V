// Last updated: 8/12/2026, 12:36:07 PM
class Solution {
    public void sortColors(int[] nums) {
        int i,c1=0,c2=0;
        for(i=0;i<nums.length;i++)
         {
            if(nums[i]==0)
	        {
	            c1++;
	        }
	        if(nums[i]==1)
	        {
	            c2++;
	        }
	       }
	        for(i=0;i<c1;i++)
	        {
	            nums[i]=0;
	        }
	        for(i=c1;i<(c1+c2);i++)
	        {
	            nums[i]=1;
	        }
	        for(i=(c1+c2);i<nums.length;i++)
	        {
	            nums[i]=2;
	        }
	        for(i=0;i<nums.length;i++)
	        {
	            System.out.print(nums[i]+" ");
	        }
 
    }
}