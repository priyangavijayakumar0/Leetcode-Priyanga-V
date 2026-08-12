// Last updated: 8/12/2026, 12:32:46 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int n=0;
        long end=Long.MIN_VALUE;
        for(int [] ballon :points){
            if(ballon[0] <= end){
                continue;
            }
            else{
                n++;
                end=ballon[1];
            }
        }
        return n;
        
    }
}