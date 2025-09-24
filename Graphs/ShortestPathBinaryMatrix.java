import java.util.*;

public class ShortestPathBinaryMatrix {

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) return -1;

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            int dist = grid[r][c];

            if (r == n - 1 && c == n - 1) return dist;

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                    queue.add(new int[]{nr, nc});
                    grid[nr][nc] = dist + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 1},
            {1, 0}
        };

        int result = shortestPathBinaryMatrix(grid);
        System.out.println(result);
    }
}
