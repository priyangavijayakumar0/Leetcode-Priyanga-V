// Last updated: 9/2/2026, 9:22:02 AM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left=1;
4        int right=0;
5        for(int pile:piles){
6            if (pile>right) right=pile;
7        }
8        while(left<right){
9            int mid =left +(right-left)/2;
10            if(canFinish(piles,h,mid)){
11                right = mid;
12            }
13            else{
14                left =mid+1;
15            }
16        }
17        return left;
18        
19
20}
21private boolean canFinish(int [] piles,int h,int speed){
22    long  hrs=0;
23    for(int pile:piles){
24        hrs+=(pile+speed-1)/speed;
25    }
26    return hrs <= h;
27    }
28}