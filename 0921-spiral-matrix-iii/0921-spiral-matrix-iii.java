class Solution {

    //Function to add coordinates in matrix
    public void add(int matrix[][], int i, int row, int col) {
        matrix[i][0] = row;
        matrix[i][1] = col;
    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        // Create result matrix
        int result[][] = new int[cols * rows][2];

        // Initialize directions, +1 horizontal = left, -1 horizontal = right
        // Similarly, +1 vertical = down, -1 vertical = up
        int horizontal = 1, vertical = 1;

        // Initialize axis counters hCtr, vCtr
        int hCtr = 1, vCtr = 1;

        // Initialize index of result row matrix
        int i = 0;

        // Add initial coordinates
        add(result, i++, rStart, cStart);

        // Loop runs until all rows are filled in result matrix
        while (i < cols * rows) {

            // Loop until horizontal counter to move left or right desired no. of times
            for (int j = 0; j < hCtr; j++) {
                // Add horizontal to cStart 
                // Increments cStart in case of left, decrements cStart in case of right
                cStart += horizontal;

                // Check for out of bounds case then add coordinates
                if (rStart < rows && rStart >= 0 && cStart >= 0 && cStart < cols)
                    add(result, i++, rStart, cStart);
            }

            // Reverse the horizontal direction
            horizontal *= -1;
            // Increment horizontal counter
            hCtr++;

            // Similary, repeat the steps for vertical direction
            for (int k = 0; k < vCtr; k++) {
                rStart += vertical;
                if (rStart < rows && rStart >= 0 && cStart >= 0 && cStart < cols)
                    add(result, i++, rStart, cStart);
            }
            vertical *= -1;
            vCtr++;
        }
        return result;
    }
}