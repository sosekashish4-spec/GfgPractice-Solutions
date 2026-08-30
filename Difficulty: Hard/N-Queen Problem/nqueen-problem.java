class Solution {
    public boolean valid(int row,int col,int n,boolean[][]grid){
        for(int i=0;i<col;i++) if(grid[row][i]) return false;
        
        for(int i=0;i<row;i++) if(grid[i][col]) return false;
    
        int k=col-1;
        int j=row-1;
        while(k>=0 && j>=0) if(grid[j--][k--]) return false;
        
        k=col+1;
        j=row-1;
        while(k<n && j>=0) if(grid[j--][k++]) return false;
        
        return true;
    }
    public void queen(ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>sol,int row,int n ,boolean[][]grid){
        if(row==n){
            ArrayList<Integer>a=new ArrayList<>(sol);
            ans.add(a);
            return;
        }
        for(int i=0;i<n;i++){
            if(!valid(row,i,n,grid)) continue;
            else{
                sol.add(i+1);
                grid[row][i]=true;
                queen(ans,sol,row+1,n,grid);
                sol.remove(sol.size()-1);
                grid[row][i]=false;
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
         ArrayList<Integer>sol=new ArrayList<>();
         boolean[][]grid=new boolean[n][n];
         queen(ans,sol,0,n,grid);
         return ans;
    }
}