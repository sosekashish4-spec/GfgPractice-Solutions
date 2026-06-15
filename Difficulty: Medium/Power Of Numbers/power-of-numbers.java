class Solution {
    static int m=0;
    public int reverseExponentiation(int n) {
        // code here
        // if(n==10) return 10;
        // int m=n;
        //  for(int i=1;i<=n;i++){
        //     n=n*m;
        //  }
        //  return n;
        
        //Recursion
        if(n==10)  return n;
        return pow(n,n);  
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        int call=pow(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
}
