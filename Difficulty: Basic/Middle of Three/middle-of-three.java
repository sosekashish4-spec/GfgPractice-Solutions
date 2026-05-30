// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        if(a>b && b>c||c>b && b>a) return b;
        if(b>c && c>a||c>b && a>c) return c;
        return a;
        
    }
}