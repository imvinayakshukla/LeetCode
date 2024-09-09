class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] spiral= new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(spiral[i], -1);
        }
        int top = 0, down = m-1, left = 0, right = n-1;
        while(head!=null){
            for(int col = left; col <= right && head != null; col++){
                spiral[top][col] = head.val;
                head = head.next;
            }
            top++;
            for(int row = top; row <= down && head != null; row++){
                spiral[row][right] = head.val;
                head = head.next;
            }
            right--;
            for(int col = right; col >= left && head != null; col--){
                spiral[down][col] = head.val;
                head = head.next;
            }
            down--;
            for(int row = down; row >= top && head != null; row--){
                spiral[row][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return spiral;
    }
}