/*
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
class Pair{
     Node node;
     int dist;
     Pair(Node node,int dist){
         this.node=node;
         this.dist=dist;
     }
 }
class Solution {
     public ArrayList<Integer> topView(Node root) {
         ArrayList<Integer>ans=new ArrayList<>();
         HashMap<Integer,Integer>map=new HashMap<>();
         Queue<Pair>q=new LinkedList<>();
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         q.add(new Pair(root,0));
         while(q.size()>0){
             Pair front=q.remove();
             Node node=front.node;
             int dist=front.dist;
             min=Math.min(min,dist);
             max=Math.max(max,dist);
             if(!map.containsKey(dist)) map.put(dist,node.data);
             if(node.left!=null) q.add(new Pair(node.left,dist-1));
             if(node.right!=null) q.add(new Pair(node.right,dist+1));
         }
         for(int i=min;i<=max;i++){
             ans.add(map.get(i));
         }
         return ans;
     }
}