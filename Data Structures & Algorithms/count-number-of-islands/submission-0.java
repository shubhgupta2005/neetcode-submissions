class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    cnt++;
                    bfs(i, j, vis, grid);
                }
            }
        }
        return cnt;
    }
    private void bfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty()){
            int r=q.peek().getKey();
            int c=q.peek().getValue();
            q.remove();
            int [][] dir={{1,0},{-1,0},{0,1},{0,-1}};
            for(int[] d :dir){
                int nrow=r+d[0];
                int ncol=c+d[1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0 ){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    }
}
