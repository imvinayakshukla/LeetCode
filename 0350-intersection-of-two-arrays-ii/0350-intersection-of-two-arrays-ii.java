class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums2.length; i++) {
            mp.put(nums2[i], mp.getOrDefault(nums2[i], 0) + 1);

        }

        for (int i = 0; i < nums1.length; i++) {
            if(mp.containsKey(nums1[i]))
            {
                if(mp.getOrDefault(nums1[i], 0) > 0 )
                list.add(nums1[i]);
                mp.put(nums1[i], mp.getOrDefault(nums1[i], 0) - 1);
            }

        }

        int ans[] = new int[list.size()];
        for (int i : list) {
            ans[k++] = i;
        }

        return ans;

    }
}