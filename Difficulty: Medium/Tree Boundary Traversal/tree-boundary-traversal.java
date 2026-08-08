/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public void leftbound(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
         ans.add(root.data);
        if(root.left!=null) leftbound(root.left,ans);
        else leftbound(root.right,ans);
    }
    
    public void leaf(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        leaf(root.left,ans);
        leaf(root.right,ans);
    }
    
    public void right(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) right(root.right,ans);
        else right(root.left,ans);
        ans.add(root.data);
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
         ArrayList<Integer>ans=new ArrayList<>();
         ans.add(root.data);
         if(root.left==null && root.right==null) return ans;
         
         leftbound(root.left,ans);
         leaf(root,ans);
         right(root.right,ans);
         return ans;
    }
}