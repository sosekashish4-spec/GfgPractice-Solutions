class Solution {
     public int countKdivPairs(int[] arr, int k) {
          HashMap<Integer,Integer>map=new HashMap<>();
          for(int i=0;i<arr.length;i++){
              int rem=arr[i]%k;
              if(map.containsKey(rem)){
                  int freq=map.get(rem);
                  map.put(rem,freq+1);
              }else  map.put(rem,1); 
          }   

          int sum=0;
          if(k%2==0 && map.containsKey(k/2)){
              int half=map.get(k/2);
              sum+=((half)*(half-1))/2;
          }
          if(map.containsKey(0)){
              int zero=map.get(0);
              sum+=((zero)*(zero-1))/2;
          }
          sum*=2;

          for(int ele:map.keySet()){
              if (ele != 0 && !(k % 2 == 0 && ele == k / 2)) {
                 int complement = k - ele;

                 if (map.containsKey(complement)) {
                   sum += map.get(ele) * map.get(complement);
               }
          }
          }
          return sum/2;
     }
}