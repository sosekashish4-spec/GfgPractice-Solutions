class Solution {
    public boolean sol(int []arr,int k,int mid,int a){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[a]>=mid){
                a=i;
                count++;
                if (count >= k) {
                    return true;
                }
            } 
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
         Arrays.sort(arr);
         int lo=1;
         int hi=arr[arr.length-1]-arr[0];
         int ans=0;
         while(lo<=hi){
             int mid=lo+(hi-lo)/2;
             if(sol(arr,k,mid,0)){
                 ans=mid;
                 lo=mid+1;
             }else hi=mid-1;
         }
         return ans;
    }
}