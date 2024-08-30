import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        s = s.trim(); 
        ArrayList<String> words = new ArrayList<>();
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i > start) { 
                    words.add(s.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < s.length()) {
            words.add(s.substring(start));
        }

        Collections.reverse(words); 
        
        return String.join(" ", words);
    }
}
