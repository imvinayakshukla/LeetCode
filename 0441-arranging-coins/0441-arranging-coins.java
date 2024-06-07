class Solution {
    public int arrangeCoins(int n) {

        int row = 1;
        int cnt = 1;
        while(row<=n)
        {
            n=n-row;
            row++;
            
            
            
            
        }
        
        return row-1;

    }
}