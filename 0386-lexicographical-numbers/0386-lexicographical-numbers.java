class Solution {
    public List<Integer> lexicalOrder(int n) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        for (String i : list) {
            ans.add(Integer.parseInt(i));
        }

        return ans;
    }
}