class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int l=arr.length;

        if(l!=m*n)
        return new int[0][0];
                int [][] newArr=new int[m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            newArr[i][j]=arr[c++];
        }
        return newArr;
    }
}