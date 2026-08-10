/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public void check(Node root,int key,Node temp){
        if(root==null) return;
        if(root.data<key){
             check(root.right,key,temp);
            if(root.right==null){
                root.right=temp;
                return;
            }
        } 
        else{
             check(root.left,key,temp);
            if(root.left==null){
                root.left=temp;
                return;
            }
        }
    }
    public Node insert(Node root, int key) {
        check(root,key,new Node(key));
        return root;
    }
}
