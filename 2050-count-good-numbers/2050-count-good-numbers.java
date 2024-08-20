class Solution {
    final static long M=(long)1e9+7;
    long pow(long x , long n){
        long result=1;
         x = x % M;
        while (n > 0) {
            if (n % 2 == 1)
                result = (result * x) % M;
            x = (x * x) % M;
            n /= 2;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        if(n%2==0){
            //System.out.println();
            return (int)((pow(5,n/2)*pow(4,n/2))%M);
        }return (int)((pow(5,(n/2)+1)*pow(4,n/2))%M);
    }
}