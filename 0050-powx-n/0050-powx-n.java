class Solution {
    public double myPow(double x, int n) {
        if(x==1.0 ||x==0.0){
            return x;
        }
        if(n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE){
            if(x==-1)
                return x;
            return 0;
        }
        if(n==0){
            return 1;
        }
        else if(n<0 ){
            return (1/x) * myPow(x,n+1);
        }
        else{
            return x * myPow(x,n-1);
        }
    }
}