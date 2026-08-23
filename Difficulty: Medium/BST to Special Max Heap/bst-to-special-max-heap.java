/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    static int ind;
    public static void convertToMaxHeap(Node root) {
         ind=0;
         ArrayList<Integer>in=new ArrayList<>();
         inorder(root,in);
         postorder(root,in);
    }
    public static void inorder(Node root,ArrayList<Integer>in){
        if(root==null) return;
        inorder(root.left,in);
        in.add(root.data);
        inorder(root.right,in);
    }
    public static void postorder(Node root,ArrayList<Integer>in){
        if(root==null) return;
        postorder(root.left,in);
        postorder(root.right,in);
        root.data=in.get(ind++);
    }
}