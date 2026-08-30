class Solution {
    public static boolean valid(String st){
        int n=st.length();
        if(n==1) return true;
        int i=0,j=n-1;
        while(i<j){
            if(st.charAt(i++)!=st.charAt(j--)) return false;
        }
        return true;
    }
    public static void solutions(ArrayList<ArrayList<String>>ans,ArrayList<String>str,String s,int m){
        // if(m==s.length()){
        //     ans.add(str);
        //     return;
        // }
        // for(int i=0;i<s.length()+1;i++){
        //     for(int j=i;j<s.length()+1;j++){
        //         String word=s.substring(i,j);
        //         if(valid(word)==false) continue;
        //         else{
        //             solutions(ans,str.add(s.substring(i,j)),s,m+1);
        //         }
        //     }
        // }
        
        // We have partitioned the whole string
        if (m == s.length()) {
            ans.add(new ArrayList<>(str));
            return;
        }

        // Try every substring starting from m
        for (int i = m; i < s.length(); i++) {

            String word = s.substring(m, i + 1);

            // Only choose palindrome substrings
            if (valid(word)) {

                str.add(word);

                // Move to the remaining part
                solutions(ans, str, s, i + 1);

                // BACKTRACK
                str.remove(str.size() - 1);
            }
        }
    }
    public static ArrayList<ArrayList<String>> palinParts(String s) {
         ArrayList<ArrayList<String>>ans=new ArrayList<>();
         ArrayList<String>str=new ArrayList<>();
         solutions(ans,str,s,0);
         //Collections.sort(ans);
         return ans;
    }
}
