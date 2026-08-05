/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    static int max;
    public int level(Node root){
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        max=Math.max(left+right,max);
        return 1+Math.max(left,right);
    }
    public int diameter(Node root) {
        max=0;
        level(root);
        return max;
    }
}