/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    boolean exists(Node root,int n){
        if(root==null) return false;
        if(root.data==n) return true;
         
        return (exists(root.left,n) || exists(root.right,n));
    }
    Node lca(Node root, int n1, int n2) {
        boolean a=exists(root.left,n1);
        boolean b=exists(root.left,n2);
        if(root.data==n1 || root.data==n2) return root;
        if((a && b)==true){
            return lca(root.left,n1,n2);
        }else if((a || b)==true) return root;
        else{
            return lca(root.right,n1,n2);
        }
    }
}