// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int sum=0;
        int m;
        while(n!=0){
            m=n%10;
            n/=10;
            sum+=m;
            sum*=10;
        }
        return sum/10;
    }
}