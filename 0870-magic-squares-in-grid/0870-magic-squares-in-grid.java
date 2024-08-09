class Solution {
    int count=0;
    public void checksq(int x, int y, int grid[][]){
        int sum[]=new int[3];
        int colsum[]=new int[3];
        boolean arr[]=new boolean[10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i]+=grid[x+i][y+j];
                colsum[j]+=grid[x+i][y+j];
                if(grid[x+i][y+j]==0 || grid[x+i][y+j]>9 || arr[grid[x+i][y+j]]){
                    return;
                }
                arr[grid[x+i][y+j]]=true;
            }
        }
        for(int i=1;i<3;i++){
            if(sum[i]!=sum[i-1] || sum[i]!=colsum[i] || colsum[i]!=colsum[i-1]){
                return;
            }
            int dig=grid[x][y]+grid[x+1][y+1]+grid[x+2][y+2];
            if(dig!=(grid[x][y+2]+grid[x+1][y+1]+grid[x+2][y]) || dig!=sum[0]){
                return;
            }
        }
        count++;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(m<3 || n<3){
            return 0;
        }
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                checksq(i,j,grid);
            }
        }
        return count;
    }
}