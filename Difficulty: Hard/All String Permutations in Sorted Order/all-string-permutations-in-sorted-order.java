class Solution {
    public void perm(StringBuilder sb,ArrayList<String>ans,int i){
        int n=sb.length();
        if(i==n){
            ans.add(sb.toString());
            return;
        }
            for(int j=i;j<n;j++){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                // fix current position and recurse
                perm(sb,ans,i+1);

                // backtrack
                temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
            }
    }
    public ArrayList<String> permutation(String s) {
         ArrayList<String>ans=new ArrayList<>();
         StringBuilder sb = new StringBuilder(s); 
         perm(sb,ans,0);
         Collections.sort(ans);
         return ans;
    }
}