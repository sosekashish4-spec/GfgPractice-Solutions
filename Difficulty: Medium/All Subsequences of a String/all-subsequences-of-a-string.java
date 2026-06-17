class Solution {
    public List<String> powerSet(String s) {
        List<String>list=new ArrayList<String>();
         helper("",s,0,list);
         Collections.sort(list);
         return list;
    }
    public void helper(String ans,String s,int idx,List list){
         
        if(idx==s.length()){
           list.add(ans);
            return ;
            }
        char ch=s.charAt(idx);
           helper(ans+ch,s,idx+1,list); //pick 
           helper(ans,s,idx+1,list); //skip
    }
}