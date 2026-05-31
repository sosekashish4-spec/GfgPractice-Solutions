class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum=1;
        int i=2;
        for(;i*i<=n;i++){
            if(n%i==0) sum+=(i+n/i);
        }
        //if(n%i==0) sum+=i;
        if(sum==n) return true;
        return false;
    }
};