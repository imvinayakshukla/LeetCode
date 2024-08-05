class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1)
                list.add(arr[i]);

        }
        if (k > list.size())

            return "";

        return list.get(k-1);
    }
}