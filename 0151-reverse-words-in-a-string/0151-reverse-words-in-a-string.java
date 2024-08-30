import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Trim leading and trailing spaces
        ArrayList<String> words = new ArrayList<>();
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i > start) { // This check ensures we don't add empty strings (multiple spaces)
                    words.add(s.substring(start, i));
                }
                start = i + 1;
            }
        }
        // Add the last word after the final space
        if (start < s.length()) {
            words.add(s.substring(start));
        }

        Collections.reverse(words); // Reverse the list of words
        
        // Join the words with a single space
        return String.join(" ", words);
    }
}
