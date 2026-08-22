/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int s;
    public boolean isHeap(Node root) {
         s=size(root);
         return isMax(root) && isCBT(root,1);
    }
    public int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public boolean isMax(Node root){
        if(root==null) return true;
        int leftVal=(root.left==null)?Integer.MIN_VALUE:root.left.data;
        int rightVal=(root.right==null)?Integer.MIN_VALUE:root.right.data;
        if(root.data<=leftVal || root.data<=rightVal) return false;
        return isMax(root.left) && isMax(root.right);
    }
    public boolean isCBT(Node root,int ind){
        if(root==null) return true;
        if(ind>s) return false;
        return isCBT(root.left,2*ind) && isCBT(root.right,2*ind+1);
    }
}