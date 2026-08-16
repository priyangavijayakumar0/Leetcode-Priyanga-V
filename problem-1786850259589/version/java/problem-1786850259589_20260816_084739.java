// Last updated: 8/16/2026, 8:47:39 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int max=0;
4        for(int light:lights) {
5            max=Math.max(max,light);
6        }
7        int maxpenalty=0;
8        for(int time:arrivalTime){
9            int r=time%period;
10            if(r>=max){
11                int waiting=period-r;
12                maxpenalty=Math.max(maxpenalty,waiting);
13            }
14        }
15        return maxpenalty;
16    }
17}