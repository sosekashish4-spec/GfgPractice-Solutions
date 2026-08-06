/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
 
class Solution {
    public void view(Node root,ArrayList<Integer>ans,int curlevel){
        if(root==null) return;
        if(curlevel>=ans.size()) ans.add(root.data);
        else ans.set(curlevel,root.data);
        view(root.left,ans,curlevel+1);
        view(root.right,ans,curlevel+1);
    }
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        view(root,ans,0);
        return ans;
    }
}