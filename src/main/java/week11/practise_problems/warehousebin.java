package week11.practise_problems;
public class warehousebin {

    static void warehouseSummary(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int total = 0;
        int max = grid[0][0];

        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                total += grid[i][j];

                if (grid[i][j] > max) {
                    max = grid[i][j];

                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Total = " + total);
        System.out.println("Max Coordinate = (" + maxRow + ", " + maxCol + ")");
    }

    public static void main(String[] args) {

        int[][] grid = {
                {4, 9, 2},
                {7, 1, 6},
                {3, 12, 5}
        };

        warehouseSummary(grid);
    }
}