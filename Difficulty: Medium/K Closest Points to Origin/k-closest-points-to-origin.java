class Triplet implements Comparable<Triplet>{
    int dist;
    int x;
    int y;
    Triplet(int dist,int x,int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.dist,t.dist);
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
         PriorityQueue<Triplet>pq=new PriorityQueue<>(Collections.reverseOrder());
         for(int[] point:points){
             int x=point[0];
             int y=point[1];
             int dist=x*x+y*y;
             pq.add(new Triplet(dist,x,y));
             if(pq.size()>k) pq.remove();
         }
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
          while(pq.size()!=0){
              Triplet top=pq.remove();
              ArrayList<Integer>temp=new ArrayList<>();
              temp.add(top.x);
              temp.add(top.y);
              ans.add(temp);
          }
         return ans;
    }
}