class Solution {
    public static boolean areAnagrams(String s1, String s2) {
         if(s1.length()!=s2.length()) return false;
         HashMap<Character,Integer>map=new HashMap<>();
         for(int i=0;i<s1.length();i++){
             char ch=s1.charAt(i);
             if(map.containsKey(ch)){
                 int freq=map.get(ch);
                 map.put(ch,freq+1);
             }else map.put(ch,1);
         }
         for(int j=0;j<s2.length();j++){
             char ch=s2.charAt(j);
             if(!map.containsKey(ch)) return false;
             else{
                 int freq=map.get(ch);
                 if(freq==1) map.remove(ch);
                 else map.put(ch,freq-1);
             }
         }
         return true;
    }
}