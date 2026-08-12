// Last updated: 8/12/2026, 12:30:03 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int sum = 0;

        while (numBottles >= numExchange) {
            sum += numExchange;     
            numBottles = numBottles - numExchange + 1;
        }

        return sum + numBottles;  
        
    }
}