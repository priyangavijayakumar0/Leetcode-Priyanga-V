// Last updated: 8/12/2026, 12:29:13 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int m = Math.min(numOnes, k);
        sum += m;
        k -= m;
        int n = Math.min(numZeros, k);
        k -= n;
        sum -= k;  
        return sum;
        
    }
}