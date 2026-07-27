class Solution {
    public ArrayList<Integer> nextLargerElement(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>(nums.length);
        int[]arr=new int[nums.length];
        Stack<Integer>st=new Stack<>();

        int i=nums.length-1;
        while(i>=0){
            while(st.size()!=0 && st.peek()<=nums[i]) st.pop();
            if(st.size()==0) arr[i]=-1;
            else arr[i]=st.peek();
            st.push(nums[i--]);
        }
         
        
        for(int k=0;k<arr.length;k++){
            ans.add(arr[k]);
        }
        return ans;
    }
}