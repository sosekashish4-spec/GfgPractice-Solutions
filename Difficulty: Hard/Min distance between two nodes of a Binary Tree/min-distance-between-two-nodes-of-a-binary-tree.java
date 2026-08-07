/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node lda(Node root,int a,int b){
        if(root==null) return root;
        if(root.data==a || root.data==b) return root;
        Node p=lda(root.left,a,b);
        Node q=lda(root.right,a,b);
        if(p!=null && q!=null) return root;
        return (p==null)?q:p;
    }
    public int dfs(Node req,int n,int lvl){
        if(req==null) return 0;
        if(req.data==n) return lvl;
        return dfs(req.left,n,lvl+1)+dfs(req.right,n,lvl+1);
    }
    public int findDist(Node root, int a, int b) {
         Node req= lda(root,a,b);
         return dfs(req,a,0)+dfs(req,b,0);
    }
}