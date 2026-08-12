// Last updated: 8/12/2026, 12:36:46 PM
class Solution {
    public int trap(int[] h) {
        int left =0;
        int right=h.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<right){
            if(h[left]<h[right]){
                if(h[left]>=leftmax){

                leftmax=h[left];
            }
            else{
                water+=leftmax-h[left];
            }
            left ++;
        }else{
            if (h[right] >= rightmax) {
                rightmax = h[right];
        }else{
            water+=rightmax-h[right];
        }
        right--;
    }
}
return water;
}
}