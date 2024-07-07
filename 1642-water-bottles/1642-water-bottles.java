class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numExchange > numBottles) return numBottles;

        int ans = numBottles;

        while(numBottles >= numExchange){
            int res = numBottles / numExchange;
            ans+=res;
            numBottles = numBottles % numExchange;
            numBottles+=res;
        }
        return ans;
    }
}