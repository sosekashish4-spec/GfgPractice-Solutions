/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    static boolean ans;
    public boolean isBalanced(Node root) {
        ans=true;
        level(root);
        return ans;
    }
    public int level(Node root){
        if(root==null) return 0;
        int l=level(root.left);
        int r=level(root.right);
        int dif=Math.abs(l-r);
        if(dif>1) ans=false;
        return 1+(Math.max(l,r));
    }
}