// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int m=n;
        int sum=0;
        while(n!=0){
            int k=n%10;
            sum+=(k*k*k);
            n/=10;
        }
        if(sum==m) return true;
        return false;
    }
}