class Solution {
    public int countCompleteDayPairs(int[] hours) {
     int count=0,sum=0;

        // int start=0,end=hours.length-1;

        // while(start<=end)
        // {
        //     int sum=hours[start]+hours[end];
        //     if(sum%24==0)
        //     {
        //         count++;
        //     }
            

        // }
        for(int i=0;i<hours.length;i++)
        {
            for(int j=i+1;j<hours.length;j++)
            {
                 sum=hours[i]+hours[j];
                if(sum%24==0)
                count++;
            }
        }
        

        return count;
    }
}