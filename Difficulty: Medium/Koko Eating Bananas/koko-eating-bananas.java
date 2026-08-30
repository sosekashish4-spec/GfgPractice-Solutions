class Solution {
    public int speed(int mid,int[] arr){
        int h=0;
        for(int ele:arr){
           if(ele%mid==0) h+=ele/mid;
           else h+=(ele/mid+1);
        }
        return h;
    }
    public int kokoEat(int[] arr, int k) {
         int max=Integer.MIN_VALUE;
         for(int ele:arr){
             max=Math.max(max,ele);
         }
         int lo=1,hi=max;
         int ans=max;
         while(lo<=hi){
             int mid=lo+(hi-lo)/2;
             int s=speed(mid,arr);
             if(s<=k){
                 ans=mid;
                 hi=mid-1;
             }
             else lo=mid+1;
         }
         return ans;
    }
}
