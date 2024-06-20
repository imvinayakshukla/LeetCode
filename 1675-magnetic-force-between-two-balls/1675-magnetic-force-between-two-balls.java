class Solution {
    static boolean check(int capacity, int position[],int m) {
        int ball = 1;
        int lastpos = position[0];
        for (int i = 1; i < position.length; i++) {

            if ((position[i] - lastpos) >= capacity) {
                ball++;
                lastpos = position[i];
            }
            if (ball >= m)
                return true;
        }
        return false;

    }

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int low = 1, high = position[position.length-1]-position[0];
        int mid,ans=0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (check(mid, position,m)) {
                ans=mid;
                 low = mid + 1;
                
            } else
               high = mid - 1;
        }
        return ans;
    }
}