class Solution {
    static int find(int nums2[], int key) {
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == key)
                return i;
        }
        return -1;

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
          
            int index = find(nums2, a);
            if (index == -1)
                ans[k++] = -1;
            else {
               boolean found=false;
               for(int j=index+1;j<nums2.length;j++)
               {
                if(a<nums2[j])
                    {
                        ans[k++]=nums2[j];
                        found=true;
                        break;
                    }
               }
               if(!found)
               ans[k++]=-1;
                
            }
        }

    return ans;
}}