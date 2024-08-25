class Solution {
    public int missingNumber(int[] nums) {
        int s1=0,s2=0;
       int  xor1=0,xor2=0;
        for(int i=0;i<nums.length;i++)
        {
            s1+=nums[i];
            s2+=(i+1);
            xor1=xor1^nums[i];
            xor2=xor2^(i+1);

        }

        // System.out.println(sumn);


        // int n=nums.length;

        // int s=((n)*(n-1))/2;
        // System.out.println(s);

        // return s2-s1;
        return xor1^xor2;

        
    }
}