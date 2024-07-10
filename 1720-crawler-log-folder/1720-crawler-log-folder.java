class Solution {
    public int minOperations(String[] logs) {
        int min = 0;

        for ( String str : logs ) {
        if (str.equals("../"))
            if (min == 0)
                continue;
            else
                min--;
        else if (str.equals("./"))
            min = min;
        else
            min++;
        }

        return min;
    }
}