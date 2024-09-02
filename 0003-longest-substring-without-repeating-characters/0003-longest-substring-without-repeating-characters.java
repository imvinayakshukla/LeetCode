class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mpp=new HashMap<>();

        int l=0,r=0;
        int len=0;

        while(r<s.length())
        {
            if(mpp.containsKey(s.charAt(r)))
               l=Math.max(l, mpp.get(s.charAt(r))+1 );
            mpp.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
     return len;   
    }
}