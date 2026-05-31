class Solution {
    public static int gcd(int a, int b) {
        // code here
        // int ans=1;
        // int min=((a>b)?b:a);
        // int max=((a>b)?a:b);
        // for(int i=1;i<=min;i++){
        //     if(min%i==0 && max%i==0) ans=i;
        // }
        // return ans;
        while (b != 0){
            int remainder = b;
            b = a % b;
            a = remainder;
        }
        return a;
    }
}
