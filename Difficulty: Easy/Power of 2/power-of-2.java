class Solution {
    public static boolean isPowerofTwo(int n) {
         // 1 0 0
         // 0 1 1
         // 1 1 1
         //return (n+1==(n|n+1)); 
         if(n==1) return true;
         if(n%2!=0 || n==0) return false;
         return isPowerofTwo(n/2);
    }
}