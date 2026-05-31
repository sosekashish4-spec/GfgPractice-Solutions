class Solution {
    public int prime_Sum(int n) {
        // code here
        int sum=0;
        while(n>1){
            int p=prime(n);
        if(p==1) sum+=n;
            n--;
        }
        return sum;
    }
    public static int prime(int p){
        for(int i=2;i*i<=p;i++){
            if(p%i==0) return 0;
        }
        return 1 ;
    }
}