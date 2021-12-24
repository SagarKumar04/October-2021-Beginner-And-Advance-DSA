package Backtracking;

public class NumberOfIslands {
    private void exploreIsland(int i, int j, char grid[][]) {
        if(0 <= i
        && i < grid.length
        && 0 <= j
        && j < grid[0].length
        && grid[i][j] == '1') {
            grid[i][j] = '2';

            exploreIsland(i + 1, j, grid);
            exploreIsland(i - 1, j, grid);
            exploreIsland(i, j + 1, grid);
            exploreIsland(i, j - 1, grid);
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islandCount = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    exploreIsland(i, j, grid);
                    islandCount = islandCount + 1;
                }
            }
        }

        return islandCount;
    }

    public static void main(String[] args) {
        char grid[][] = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int totalIslands = numberOfIslands.numIslands(grid);

        System.out.println("Number of Islands: " + totalIslands);
    }
}
