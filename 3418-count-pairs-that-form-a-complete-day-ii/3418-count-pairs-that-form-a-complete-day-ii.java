class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count=0;

        HashMap<Integer,Integer> mp=new HashMap<>();

      for(int i:hours)
       {
        i%=24;
        count+=mp.getOrDefault(((24-i)%24),0);
        mp.put(i,mp.getOrDefault(i,0)+1);
        
       }

        return count;
    }
}