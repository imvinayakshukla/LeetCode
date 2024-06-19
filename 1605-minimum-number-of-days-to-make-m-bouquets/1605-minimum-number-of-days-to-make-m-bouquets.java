class Solution {

    public boolean check(int[] bloomDay, int m, int k, int day) {
        int cnt = 0, bouquet = 0;

        for(int i=0;i<bloomDay.length;i++)
        {
            if(day>=bloomDay[i])
            {
                cnt++;
                if(cnt==k)
                {
                    bouquet++;
                    cnt=0;
                }

            }
            else
            {
                cnt=0;
            }
        }


        return bouquet>=m;



    }
    public int minDays(int[] bloomDay, int m, int k) {
       long val = (long) m * k;
        int n = bloomDay.length;
        if (val > n) return -1;

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

       

        int left=mini,right=maxi;

        while(left<=right)
        {
            int mid=(right+left)/2;
            if(check(bloomDay, m,  k,mid))
            right=mid-1;
            else
            left=mid+1;
        }
         return left;

    }

}