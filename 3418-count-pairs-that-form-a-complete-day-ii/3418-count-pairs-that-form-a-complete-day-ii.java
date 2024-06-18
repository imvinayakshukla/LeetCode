class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count=0;

        HashMap<Integer,Integer> mp=new HashMap<>();

       for(int i:hours)
       {
          int mod = i % 24;
            int complement = (24 - mod) % 24;
            count += mp.getOrDefault(complement, 0);
            mp.put(mod, mp.getOrDefault(mod, 0) + 1);
        
       }

        return count;
    }
}