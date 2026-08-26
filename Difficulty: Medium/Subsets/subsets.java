class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<Math.pow(2,n);i++){
            ArrayList<Integer>ar=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j)%2==1) ar.add(arr[j]);
            }
            ans.add(ar);
        }
        return ans;
    }
}