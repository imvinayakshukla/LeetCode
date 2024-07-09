class Solution {
    public double averageWaitingTime(int[][] customers) {
        int timetook=0;
        double wait=0;
        for(int arr[]:customers)
        {
            timetook=Math.max(timetook,arr[0]);
            timetook+=arr[1];
            wait+=timetook-arr[0];
        }
        return wait/customers.length;
    }
}