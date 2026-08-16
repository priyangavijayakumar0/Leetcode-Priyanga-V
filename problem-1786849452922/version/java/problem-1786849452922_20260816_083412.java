// Last updated: 8/16/2026, 8:34:12 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans=-1;
4        int mindis=Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6            int x=drones[i][0];
7            int y=drones[i][1];
8            int range=drones[i][2];
9            int dis=Math.abs(x-target[0])+Math.abs(y-target[1]);
10            if(dis<=range){
11                if(dis<mindis){
12                    mindis=dis;
13                    ans=i;
14                }
15            }
16            
17        }
18        return ans;
19        
20    }
21}