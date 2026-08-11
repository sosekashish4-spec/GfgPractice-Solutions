/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public void check(Node root,ArrayList<Integer>arr){
         if(root==null) return;
         check(root.left,arr);
         arr.add(root.data);
         check(root.right,arr);
    }
    public boolean isBST(Node root) {
        ArrayList<Integer>arr=new ArrayList<>();
        check(root,arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)) return false;
        }
        return true;
    }
}