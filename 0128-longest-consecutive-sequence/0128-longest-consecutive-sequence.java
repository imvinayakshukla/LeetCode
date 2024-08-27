class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int longe = 1;

        for (int a : nums)
            set.add(a);
        System.out.println(set);

        for (int it : set) {
            if (!set.contains(it - 1)) {
                count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
            }
            longe = Math.max(longe, count);
        }

        return longe;
    }
}