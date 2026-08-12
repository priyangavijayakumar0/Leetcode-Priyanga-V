// Last updated: 8/12/2026, 12:28:18 PM
class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int start= toSeconds(st);
        int end=toSeconds(et);
        return end-start;
        
    }
    private int toSeconds(String time){
        int h=Integer.parseInt(time.substring(0,2));
        int m=Integer.parseInt(time.substring(3,5));
        int s=Integer.parseInt(time.substring(6,8));
        return h*3600+m*60+s;
    }
}