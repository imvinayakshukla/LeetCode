class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        Map<Integer, String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        int l = 0;
        int h = n-1;
        while(l < h){
            int temp = heights[l];
            heights[l] = heights[h];
            heights[h] = temp;
            l++;
            h--;
        }

        String ans[] = new String[n];

        for(int i=0; i<n; i++){
            ans[i] = map.get(heights[i]);
        }

        return ans;
    }
}