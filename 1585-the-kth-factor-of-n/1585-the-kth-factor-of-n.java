class Solution {
    public int kthFactor(int n, int k) {
    
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= (n); i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        // Collections.sort(list);
                System.out.println(list);

        if(list.size()<k)
        return -1;

        return list.get(k-1);

    }
}