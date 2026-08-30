class Solution {
    public void paths(ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>a,int row,int col,int[][]mat){
        int m=mat.length;
        int n=mat[0].length;
        if(mat[row][col]==mat[m-1][n-1]){
            ArrayList<Integer>copy=new ArrayList<>(a);
            copy.add(mat[m-1][n-1]);
            ans.add(copy);
            return;
        }
        
        a.add(mat[row][col]);
        if(row<m-1) paths(ans,a,row+1,col,mat); //down
        if(col<n-1) paths(ans,a,row,col+1,mat); //right
        a.remove(a.size()-1);
    }
    public ArrayList<ArrayList<Integer>> allPaths(int[][] mat) {
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
         ArrayList<Integer>a=new ArrayList<>();
         paths(ans,a,0,0,mat);
         return ans;
    }
}