class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] array=new String[n];
        for(int i=0;i<n;i++)
        {
            array[i]=String.valueOf(nums[i]); // "10" "2"
        }
        Arrays.sort(array,(a,b)->(b+a).compareTo(a+b));// 102 210 -> "2" "10"
        if(array[0].equals("0"))
        {
            return "0";
        }
        String largest="";
        int n1=array.length;
        for(int i=0;i<n1;i++)
        {
           largest+=array[i];
        }
        return largest;
        
    }
}