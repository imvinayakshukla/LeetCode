class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] his = new int[1001];
        for(int i = 0; i < target.length; i++) {
            his[target[i]]++;
            his[arr[i]]--;
        }

        for(int i = 0; i < target.length; i++) {
            if(his[target[i]] != 0 || his[arr[i]] != 0) {
                return false;
            }
        }
        return true;
    }
}