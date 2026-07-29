class Solution {
    public int celebrity(int mat[][]) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<mat.length;i++) st.push(i);
        
        while(st.size()>1){
           Boolean aFlag=false;
           Boolean bFlag=false;
            int a=st.pop();
            int b=st.pop(); 
            if(mat[a][b]==1 || mat[b][a]==0) //j celeb
              aFlag=true;
            if(mat[a][b]==0 || mat[b][a]==1) //i celeb
                bFlag=true;
            if(aFlag==false) st.push(a);
            if(bFlag==false) st.push(b);
            }
            
        if(st.size()==0) return -1;
        int k=st.peek();
        for(int p=0;p<mat.length;p++){
            if(p==k) continue;
            if(mat[p][k]==0) return -1;
            if(mat[k][p]==1) return -1;
        }
        return k; 
    }
}