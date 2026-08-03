/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    
    public boolean helper(Node a,Node b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.data!=b.data) return false;
         return(helper(a.left,b.right) && helper(a.right,b.left));
    }
    public boolean isSymmetric(Node root) {
         return helper(root.left,root.right);
    }
}