class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]) max=arr[i];
            
        }
        for(int i=0;i<n;i++){
            if(max>arr[i] && smax<arr[i]) smax=arr[i];
        }
        if(smax==Integer.MIN_VALUE) return -1;
        return smax;
    }
}