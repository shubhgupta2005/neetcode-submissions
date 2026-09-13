class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int area=0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(grid[row][col]==1){
                    area=Math.max(area,bfs(grid,row,col));
                }
            }
        }
        return area;
        
    }
    private int bfs(int[][]grid,int row,int col){
        Queue<int[]>q=new LinkedList<>();
        grid[row][col]=0;
        q.add(new int[]{row,col});
        int res=1;
        while(!q.isEmpty()){
            int[] node=q.poll();
            int r=node[0];
            int c=node[1];
            int [][]direction={{1,0},{-1,0},{0,1},{0,-1}};
            for(int [] d :direction){
                int nrow=r+d[0];
                int ncol=c+d[1];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1 ){
                    q.add(new int[]{nrow,ncol});
                    grid[nrow][ncol]=0;
                    res++;
                }
            }
        }
        return res;
    }
}
