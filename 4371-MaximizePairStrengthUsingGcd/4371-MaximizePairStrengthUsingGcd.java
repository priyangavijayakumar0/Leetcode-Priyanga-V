// Last updated: 8/12/2026, 12:28:23 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=nums[i];
                int b=nums[j];
                int g=gcd(a,b);
                long st=((long) a*b)/((long ) g*g);
                max=Math.max(max,st);
            }
        }
        return max;
        
    }
    private int gcd (int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}