class Solution {
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private int bfs(int[][] grid, int r, int c) {
        int inf = 2147483647;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(r, c));

        int[][] vis = new int[rows][cols];
        vis[r][c] = 1;

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int rw = q.peek().first;
                int cw = q.peek().second;
                q.remove();

                if (grid[rw][cw] == 0) {
                    return steps;
                }

                for (int[] d : direction) {
                    int nrow = rw + d[0];
                    int ncol = cw + d[1];

                    if (nrow >= 0 && nrow < rows && ncol >= 0 && ncol < cols
                        && grid[nrow][ncol] != -1 && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }

            steps++;
        }

        return inf;
    }

    public void islandsAndTreasure(int[][] grid) {
        int inf = 2147483647;

        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == inf) {
                    grid[i][j] = bfs(grid, i, j);
                }
            }
        }
    }
}