class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> list=new ArrayList<>();
        int k=0;
        Arrays.sort(nums1);

        Arrays.sort(nums2);

        int l1=0,l2=0;

        while(l1 < nums1.length && l2 < nums2.length)
        {

            if(nums1[l1] == nums2[l2])
            {
                list.add(nums1[l1]);
                l1++;
                l2++;

            }
            else if(nums1[l1] > nums2[l2])
            {
                l2++;
                
            }
            else if(nums1[l1] < nums2[l2])
            {
                l1++;
                
            }
            
        }
        int ans[]=new int[list.size()];
        for(int i : list)
        {
            ans[k++]=i;
        }
        return ans;
    }
}