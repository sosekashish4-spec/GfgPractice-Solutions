class Solution {
    boolean checkTwo(int n){
        if(n==0) return false;
        return ((n & n-1)==0);
    }
    boolean isSqrt(int n){
        int root=(int)Math.sqrt(n);
        return (root*root==n);
    }
    boolean isPowerOfFour(int n) {
         return checkTwo(n) && isSqrt(n);
    }
}