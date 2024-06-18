class Solution {
    public int numPairsDivisibleBy60(int[] time) {
         int count=0;

        HashMap<Integer,Integer> mp=new HashMap<>();

       for(int i:time)
       {
        i%=60;
        count+=mp.getOrDefault(((60-i)%60),0);
        mp.put(i,mp.getOrDefault(i,0)+1);
        
       }

        return count;
        
    }
}