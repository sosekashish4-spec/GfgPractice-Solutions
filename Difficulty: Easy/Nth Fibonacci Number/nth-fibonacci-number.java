class Solution {
    public int nthFibonacci(int n) {
        // code here
        int a=0;
        int b=1;
        int sum=0;
        for(int i=2;i<=n;i++){
        sum=a+b;
        a=b;
        b=sum;
        }
        if(n==1) return 1;
        if(n==0) return 0;
        return sum;
    }
}