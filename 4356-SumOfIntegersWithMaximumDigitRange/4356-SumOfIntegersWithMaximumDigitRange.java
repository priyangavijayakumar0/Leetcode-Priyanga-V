// Last updated: 8/12/2026, 12:28:20 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int max=-1;
        int total =0;
        for(int num:nums){
            int cr=getDigitRange(num);
            if(cr>max){
                max=cr;
                total=num;   
            }else if(cr==max){
                total+=num;
            }
        }
        return total;
    }
    private int getDigitRange(int n){
    if(n==0)
    return 0;
    int maxD=0;
    int minD=9;
    long val=Math.abs((long)n);
        while(val>0){
            int digit=(int)(val%10);
            if (digit>maxD) maxD=digit;
            if(digit<minD)  minD=digit;
            val/=10;
        }
        return maxD-minD;
        }
        
    }
