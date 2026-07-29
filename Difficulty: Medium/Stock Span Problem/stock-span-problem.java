class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n=arr.length;
        int []nums=new int[n];
        Stack<Integer> st=new Stack<>();
        
        int idx=0;
        for(int i=0;i<arr.length;i++){
            idx=0;
            while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
            if(st.size()>0 && arr[st.peek()]>arr[i]) idx=st.peek();
            if(st.size()==0) idx=-1;
            nums[i]=i-idx;
            st.push(i);
        } 
        ArrayList<Integer>ans=new ArrayList<>();
        for(int el:nums) ans.add(el);
        return ans;
    }
}