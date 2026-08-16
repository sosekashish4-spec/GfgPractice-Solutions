class Solution {
    int countPairs(int[] arr, int k) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
         for(int ele:arr){
             if(map.containsKey(ele)){
                 int freq=map.get(ele);
                 map.put(ele,freq+1);
             }else map.put(ele,1);
         }
          for(int ele:map.keySet()){
              int rem1=ele+k;
              int rem2=ele-k;
              if(map.containsKey(rem1)) count+=map.get(ele)*map.get(rem1);
              if(map.containsKey(rem2)) count+=map.get(ele)*map.get(rem2);
          }
        return count/2;
    }
}