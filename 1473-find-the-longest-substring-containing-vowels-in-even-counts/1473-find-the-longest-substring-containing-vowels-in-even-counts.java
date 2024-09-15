import java.util.HashMap;

class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  

        int bitmask = 0;  
        int ans = 0;      

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

         
            if (ch == 'a') {
                bitmask ^= (1 << 0);  
            } else if (ch == 'e') {
                bitmask ^= (1 << 1);  
            } else if (ch == 'i') {
                bitmask ^= (1 << 2);  
            } else if (ch == 'o') {
                bitmask ^= (1 << 3); 
            } else if (ch == 'u') {
                bitmask ^= (1 << 4);  
            }

            if (map.containsKey(bitmask)) {
                ans = Math.max(ans, right - map.get(bitmask));
            } else {
                map.put(bitmask, right);
            }
        }

        return ans;
    }
}
