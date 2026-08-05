/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void allpath(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>arr){
        if(root==null) return;
         arr.add(root.data);
         if(root.left==null && root.right==null){
            ArrayList<Integer>l=new ArrayList<>();
            l.addAll(arr);
             ans.add(l);
            }
              allpath(root.left,ans,arr);
              allpath(root.right,ans,arr);
            arr.removeLast();
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        allpath(root,ans,arr);
        return ans;
    }
}