class Solution {

    private int[][] direction = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void islandsAndTreasure(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        // Put ALL treasures into queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 0) {
                    q.add(new Pair(i, j));
                }
            }
        }

        // BFS
        while (!q.isEmpty()) {

            int rw = q.peek().first;
            int cw = q.peek().second;
            q.remove();

            for (int[] d : direction) {

                int nrow = rw + d[0];
                int ncol = cw + d[1];

                if (nrow >= 0 && nrow < rows &&
                    ncol >= 0 && ncol < cols &&
                    grid[nrow][ncol] == 2147483647) {

                    grid[nrow][ncol] = grid[rw][cw] + 1;

                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }
}