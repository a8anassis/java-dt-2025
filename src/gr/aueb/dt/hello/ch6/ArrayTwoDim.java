package gr.aueb.dt.hello.ch6;

public class ArrayTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];
        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        grid[1][2] = 5;
        grid2[0][2] = 19;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid2) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }
}
