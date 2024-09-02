class Solution {
    public boolean func(int mid,int[]piles,int h)
    {

        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum+=(Math.ceil((double)piles[i]/(double)mid));

        }
        if(sum<=h)
        return true;
        return false;

    }
    public int minEatingSpeed(int[] piles, int h) {

        int low=0,high=piles[0];
        for(int i:piles)
        high=Math.max(high,i);
        System.out.println(high);

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(func(mid,piles,h))
                high=mid-1;
            else
                low=mid+1;
            


        }

        return low;
        
    }
}