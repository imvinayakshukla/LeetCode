class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int wc[] = new int[26];
        int pc[] = new int[26];

        if (s.length() < p.length())
            return list;

        for (int i = 0; i < p.length(); i++) {
            pc[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length() - 1; i++) {
            wc[s.charAt(i) - 'a']++;

        }

        for (int i = p.length() - 1; i < s.length(); i++) {
            wc[s.charAt(i) - 'a']++;
            if (Arrays.equals(wc, pc))
                list.add(i - p.length() + 1);

            wc[s.charAt(i - p.length() + 1) - 'a']--;

        }

        return list;
    }
}