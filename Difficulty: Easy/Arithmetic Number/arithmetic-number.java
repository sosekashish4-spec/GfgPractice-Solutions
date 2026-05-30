// User function Template for Java

class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        int n=1;
        int t=a+(n-1)*c;
        while(b>t && c>0||b<t && c<0){
            t=a+(n-1)*c;
            n++;
        }
        if(t==b) return 1;
        return 0;
    }
}