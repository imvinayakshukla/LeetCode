class Solution {
    public int ncr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;

    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        for (int j = 0; j < n; j++) {
             List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<=j;i++)
            {
               
                list.add(ncr(j,i));
            }

            ans.add(list);
        }
            return ans;

    }
}