class Solution {
    public static void trav(Node root,ArrayList<Node>ans){
        if(root==null) return;
        ans.add(root);
        trav(root.left,ans);
        trav(root.right,ans);
    }
    public static void flatten(Node root) {
         ArrayList<Node>ans=new ArrayList<>();
         trav(root,ans);
         Node temp=root;
         for(int i=0;i<ans.size()-1;i++){
             temp.left=null;
             temp.right=ans.get(i+1);
             temp=temp.right;
         }
    }
}