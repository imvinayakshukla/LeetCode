class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    continue;
                if (arr[i].equals(arr[j]))
                    count++;
            }
            if (count == 0)
                list.add(arr[i]);
        }
        if (k > list.size())
            return "";

        return list.get(k - 1);
    }
}