import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(ans(n,0));
        
    }
    public static int ans(int n,int sum) {
        if(n==0) return sum;
         
        return ans(n-1,sum+n);
    }
}