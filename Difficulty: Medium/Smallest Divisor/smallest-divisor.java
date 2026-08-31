class Solution {
    boolean sol(int mid,int []arr,int k){
        int sum=0;
        for(int ele:arr){
            sum+=(ele+mid-1)/mid;
            if(sum>k) return false;
        }
        return true;
    }
    int smallestDivisor(int[] arr, int k) {
        int n=arr.length;
        if(k<n) return -1;
        Arrays.sort(arr);
        int sum=0;
        for(int ele:arr) sum+=ele;
        int lo=1;
        int hi=arr[n-1];
        int ans=hi;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(sol(mid,arr,k)){
                ans=mid;
                hi=mid-1;
            }else lo=mid+1;
        }
        return ans;
    }
}