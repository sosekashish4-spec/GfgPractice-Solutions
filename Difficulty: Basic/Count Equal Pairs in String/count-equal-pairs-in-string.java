class Solution {
    public int equalPairs(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else map.put(ch,1);
        }
        int ans=0;
        for(char j:map.keySet()){
            int fre=map.get(j);
            ans+=fre*fre;
        }
        return ans;
    }
}