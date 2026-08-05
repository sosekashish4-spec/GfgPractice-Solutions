/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    int level(Node root){
        if(root==null) return 0;
        return 1+(Math.max(level(root.left),level(root.right)));
    }
    
    int totalNodes(Node root){
        if(root==null) return 0;
        return 1+(totalNodes(root.left)+totalNodes(root.right));
    }
    boolean isPerfect(Node root) {
        int n=level(root);
        int m=(int)Math.pow(2,n)-1;
        return (totalNodes(root)==m);
    }
};