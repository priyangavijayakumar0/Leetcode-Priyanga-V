// Last updated: 9/2/2026, 9:59:04 AM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int left = matrix[0][0], right = matrix[n-1][n-1];
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            int count = countLessEqual(matrix, mid);
8
9            if (count < k) {
10                left = mid + 1;
11            } else {
12                right = mid;
13            }
14        }
15        return left;
16    }
17    private int countLessEqual(int[][] matrix, int mid) {
18        int n = matrix.length;
19        int row = n - 1, col = 0, count = 0;
20        while (row >= 0 && col < n) {
21            if (matrix[row][col] <= mid) {
22                count += row + 1;
23                col++;
24            } else {
25                row--;
26            }
27        }
28        return count;
29    }
30}
31