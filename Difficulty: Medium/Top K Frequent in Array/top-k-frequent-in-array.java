class Pair implements Comparable<Pair>{
    int freq;
    int z;
    Pair(int z,int freq){
        this.freq=freq;
        this.z=z;
    }
    public int compareTo(Pair p){
        if(this.freq==p.freq) return Integer.compare(this.z,p.z);
        return Integer.compare(this.freq,p.freq);
    }
}
class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
         PriorityQueue<Pair>pq=new PriorityQueue<>();
         for(int ele:arr){
              map.put(ele,map.getOrDefault(ele,0)+1);
         }
         for(int ele:map.keySet()){
             int fr=map.get(ele);
             pq.add(new Pair(ele,fr));
             if(pq.size()>k) pq.remove();
         }
         ArrayList<Integer>ans=new ArrayList<>();
         while(pq.size()!=0){
             Pair top=pq.remove();
             ans.add(top.z);
         }
         Collections.reverse(ans);
         return ans;
    }
}
