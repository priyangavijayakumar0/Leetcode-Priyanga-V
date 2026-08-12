// Last updated: 8/12/2026, 12:29:20 PM
class Solution {
    public int passThePillow(int n, int time) {
     int cycle=time/(n-1);
     int rs=time%(n-1);
     return cycle%2==0?rs+1:n-rs;
    }
}