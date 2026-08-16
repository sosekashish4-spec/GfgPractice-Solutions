
class Solution {
    public boolean isSubset(int a[], int b[]) {
        if(a.length<b.length) return false;
         HashMap<Integer,Integer>map1=new HashMap<>();
         for(int ele:a){
             if(map1.containsKey(ele)){
                 int freq=map1.get(ele);
                 map1.put(ele,freq+1);
             }else map1.put(ele,1);
         }
         HashMap<Integer,Integer>map2=new HashMap<>();     
         for(int ele:b){
             if(!map1.containsKey(ele)) return false;
             if(map2.containsKey(ele)){
                 int freq=map2.get(ele);
                 map2.put(ele,freq+1);
             }else map2.put(ele,1);
         }
        for(int ele:map2.keySet()){
            int c=map1.get(ele);
            int d=map2.get(ele);
            if(c<d) return false;
        }
        return true;
    }
}
