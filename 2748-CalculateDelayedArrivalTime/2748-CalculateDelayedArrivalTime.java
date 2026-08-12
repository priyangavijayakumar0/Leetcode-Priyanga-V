// Last updated: 8/12/2026, 12:29:09 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int res=arrivalTime+delayedTime;
        int res1=res%24;
        return res1;
    }
}
       

        