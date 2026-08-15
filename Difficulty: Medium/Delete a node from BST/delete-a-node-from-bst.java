class Solution {
    public Node delNode(Node root, int x) {
        if(root==null) return null;
         if(root.data>x){
             root.left=delNode(root.left,x);
         }else if(root.data<x){
             root.right=delNode(root.right,x);
         }else{
             if(root.right==null && root.left==null) return null;
             if(root.right==null) return root.left;
             if(root.left==null) return root.right;
            
             Node pred=root.left;
             while(pred.right!=null) pred=pred.right;
             root.left=delNode(root.left,pred.data);
             pred.right=root.right;
             pred.left=root.left;
             return pred;
         }
         return root;
    }
}