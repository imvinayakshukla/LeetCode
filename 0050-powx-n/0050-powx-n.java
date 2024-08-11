class Solution {
    public double myPow(double x, int n) {
        return  pow1(x,(long)n);
    }
    public static double pow1(double x, long n){
        if(n==0) return 1;
        if(n<0) return 1.0/ pow1(x,-1*n);
        if(n%2==1){
            return x*pow1(x*x,(n-1)/2);
        }
        else{
            return pow1(x*x,n/2);
        }
    }
}