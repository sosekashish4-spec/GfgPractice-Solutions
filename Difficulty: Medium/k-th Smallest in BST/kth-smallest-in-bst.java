/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void ans(Node root,ArrayList<Integer>arr){
        if(root==null) return;
        ans(root.left,arr);
        arr.add(root.data);
        ans(root.right,arr);
    }
    public int kthSmallest(Node root, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
         ans(root,arr);
         if(arr.size()<k) return -1;
         return arr.get(k-1);
    }
}