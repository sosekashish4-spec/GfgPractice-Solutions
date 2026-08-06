/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public void view(Node root,ArrayList<Integer>ans,int level){
        if(root==null) return;
        if(ans.size()<=level) ans.add(root.data);
        view(root.left,ans,level+1);
        view(root.right,ans,level+1);
    }
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        view(root,ans,0);
        return ans;
    }
}