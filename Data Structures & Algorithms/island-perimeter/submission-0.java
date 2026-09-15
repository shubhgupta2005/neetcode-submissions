class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] vis=new int[n][m];
        int peri=0;
        int found=0;
        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    vis[i][j]=1;
                    found=1;
                    break;
                }
            }
            if(found==1){
                break;
            }
        }
        while(!q.isEmpty()){
            int first=q.peek().first;
            int second=q.peek().second;
            q.remove();
            int [][] direction={{1,0},{-1,0},{0,1},{0,-1}};
            for(int [] dir:direction){
                int nrow=first+dir[0];
                int ncol=second+dir[1];
                if(nrow<0 || ncol<0 || nrow>=n || ncol>=m || grid[nrow][ncol]==0){
                    peri++;
                }
                else if(vis[nrow][ncol]==0){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        return peri;
                
    }
}