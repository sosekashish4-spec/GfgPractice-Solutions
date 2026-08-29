class Solution {
    public void paths(int[][]maze,int row,int col,String str,ArrayList<String>ans){
        int n=maze.length;
        if(row==n-1 && col==n-1){
            ans.add(str);
            return;
        }
            maze[row][col]=0;
            if(col<n-1 && maze[row][col+1]==1) paths(maze,row,col+1,str+"R",ans);
            if(row<n-1 && maze[row+1][col]==1) paths(maze,row+1,col,str+"D",ans);
            if(col>0 && maze[row][col-1]==1) paths(maze,row,col-1,str+"L",ans);
            if(row>0 && maze[row-1][col]==1) paths(maze,row-1,col,str+"U",ans);
            maze[row][col]=1;
            return;
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        ArrayList<String>ans=new ArrayList<>();
        if(maze[0][0]==0) return ans;
        if(maze[n-1][n-1]==0) return ans;
         paths(maze,0,0,"",ans);
         Collections.sort(ans);
         return ans;
    }
}