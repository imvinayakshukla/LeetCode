class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[arr1.length];
        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!mp.containsKey(arr1[i]))
                mp.put(arr1[i], 1);
            else
                mp.put(arr1[i], mp.get(arr1[i]) + 1);

        }
        for (int i = 0; i < arr2.length; i++) {
            if (mp.containsKey(arr2[i])) {
                for (int j = 1; j <= mp.get(arr2[i]); j++)
                    ans[ind++] = arr2[i];
            }
            mp.remove(arr2[i]);
        }
        int inx=ind;
        for (HashMap.Entry<Integer, Integer> it : mp.entrySet()) {
           for (int j = 1; j <= it.getValue(); j++)
                    ans[ind++] = it.getKey();

        }
     Arrays.sort(ans, inx, ans.length);
        return ans;

    }
}