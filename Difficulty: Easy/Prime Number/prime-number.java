class Solution {
    static boolean isPrime(int n) {
        // code here
        int count=1;
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) count++;
        }
        if(count>1) return false;
        return true;
    }
}