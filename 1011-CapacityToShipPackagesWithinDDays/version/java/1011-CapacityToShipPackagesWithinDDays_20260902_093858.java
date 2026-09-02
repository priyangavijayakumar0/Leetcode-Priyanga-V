// Last updated: 9/2/2026, 9:38:58 AM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int left=0, right=0;
4        for (int w:weights) {
5            left=Math.max(left, w); 
6            right+=w;               
7        }
8
9        while(left<right) {
10            int mid=left+(right-left)/2;
11            if (canShip(weights,days, mid)) {
12                right = mid; 
13            } else {
14                left = mid + 1; 
15            }
16        }
17        return left;
18    }
19
20    private boolean canShip(int[] weights, int days, int capacity) {
21        int usedDays = 1, currentLoad = 0;
22        for (int w : weights) {
23            if (currentLoad + w > capacity) {
24                usedDays++;       
25                currentLoad = 0; 
26            }
27            currentLoad += w;
28        }
29        return usedDays <= days;
30    }
31}