// User function Template for Java
 
class Solution {
    double findArea(int A, int B, int C) {
        // code here
        if(A+B<=C||A+C<=B||B+C<=A) return 0;
        double s=(A+B+C)/2.0;
        double ar=s*(s-A)*(s-B)*(s-C);
        double area=Math.sqrt(ar);
        return area;
    }
};