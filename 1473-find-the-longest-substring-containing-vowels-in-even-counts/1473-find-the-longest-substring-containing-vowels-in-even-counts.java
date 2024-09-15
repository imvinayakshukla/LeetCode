import java.util.HashMap;

class Solution {
    public int findTheLongestSubstring(String s) {
        // Map to store the first occurrence of each bitmask state
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Initially, the bitmask is 0 (no vowels), and it occurs before the start of the string

        // Vowel to bitmask mapping
        int bitmask = 0;  // Bitmask to track the even/odd counts of vowels
        int ans = 0;      // Variable to store the length of the longest valid substring

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Update the bitmask based on the current character
            if (ch == 'a') {
                bitmask ^= (1 << 0);  // Toggle the bit for 'a'
            } else if (ch == 'e') {
                bitmask ^= (1 << 1);  // Toggle the bit for 'e'
            } else if (ch == 'i') {
                bitmask ^= (1 << 2);  // Toggle the bit for 'i'
            } else if (ch == 'o') {
                bitmask ^= (1 << 3);  // Toggle the bit for 'o'
            } else if (ch == 'u') {
                bitmask ^= (1 << 4);  // Toggle the bit for 'u'
            }

            // If this bitmask has been seen before, we found a valid substring
            if (map.containsKey(bitmask)) {
                ans = Math.max(ans, right - map.get(bitmask));
            } else {
                // Otherwise, store the first occurrence of this bitmask
                map.put(bitmask, right);
            }
        }

        return ans;
    }
}
