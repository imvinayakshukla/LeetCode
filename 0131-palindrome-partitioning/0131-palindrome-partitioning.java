class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int inx = 0;
        cal(s, inx, ans, list);
        return ans;

    }

    static void cal(String s, int inx, List<List<String>> ans, List<String> ds) {

        if (inx == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;

        }
        for (int i = inx; i < s.length(); i++) {
            if (isPal(s, inx, i)) {
                ds.add(s.substring(inx ,i+1));
                cal(s, i+1, ans, ds);
                ds.remove(ds.size() - 1);

            }
        }
    }
    static boolean isPal(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }

        return true;

    }
}