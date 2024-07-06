class Solution {
    public int maxHeightOfTriangle(int red, int blue) {

        int small=Math.min(red,blue);
        int large=Math.max(red,blue);

    int row=0;
    int balls=1;
    int even=0,odd=0,curr;

    while(true)
    {
        if(balls%2==0)
        {
            even+=balls;
            curr=even;
        }
        else
        {
            odd+=balls;
            curr=odd;
        }

        if(small < (even-balls) || small < odd-balls)
        return row-1;
        if(large < (even) || large < odd)
        return row;

        row++;
        balls++;
    }
        
    }
}