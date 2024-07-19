class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int min = 100000;
            int col = -1;
            for (int j = 0; j < row.length; j++) {
                if (row[j] < min) {
                    min = row[j];
                    col = j;
                }
            }
            boolean rowGood = true;
            for (int k = 0; k < matrix.length; k++) {
                int num = matrix[k][col];

                if (num > min) {
                    rowGood = false;
                }
            }
            if (rowGood) {
                lst.add(min);
            }
        }
        return lst;
    }
}