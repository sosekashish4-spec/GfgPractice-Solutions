class Solution {
        ArrayList<Integer>ans=new ArrayList<>();
    public ArrayList<Integer> subsetSums(int[] arr) {
        subset(arr,0,0);
        return ans;
    }
        // code here
        public  void subset(int[] arr, int idx,int sum ) {
        
        if(idx==arr.length) {
            ans.add(sum);
            return;
        }
            
        subset(arr, idx+1,sum+arr[idx]);
        subset(arr, idx+1,sum);
        
    }
    
}