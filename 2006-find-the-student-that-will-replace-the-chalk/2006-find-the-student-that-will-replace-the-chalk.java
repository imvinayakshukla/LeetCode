class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        if(chalk.length==1)
            return 0;

            long sum=0;
            for(int i=0;i<chalk.length;i++)
                sum+=chalk[i];

                long r=k%sum;
                System.out.println(k);

        for(int i=0;i<chalk.length;i=(i+1)%(chalk.length))
        {
            if(r<chalk[i])
                return i;

            r=r-chalk[i];
        }
        return r;
        
    }
}