class Solution {
    public void paths(int row,int col,int[][] mat,ArrayList<ArrayList<Integer>>ans,int[][]matrix){
        int m=mat.length;
        int n=mat[0].length;
        if(row==m-1 && col==n-1){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==1) arr.add(mat[i][j]);
                }
            }
            arr.add(mat[m-1][n-1]);
            ans.add(arr);
            return;
        }
        if(row>=m || col>=n) return;
        matrix[row][col]=1; //mark
        paths(row,col+1,mat,ans,matrix); //calls
        paths(row+1,col,mat,ans,matrix);
        matrix[row][col]=0; //unmark
        return;
    }
    public ArrayList<ArrayList<Integer>> allPaths(int[][] mat) {
        int[][]matrix=new int[mat.length][mat[0].length];
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        paths(0,0,mat,ans,matrix);
        return ans;
    }
}