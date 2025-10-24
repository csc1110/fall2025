package wk8b;

public class Lec3 {
    public static void main(String[] args) {
        char[][] grid = create(10, 10, '*');
        // change diagonal to spaces
        for (int i = 0; i < grid.length; i++) {
            grid[i][grid.length - 1 - i] = ' ';
        }
        print(grid);
    }

    private static void print(char[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
    }

    private static char[][] create(int row, int col, char fillValue) {
        char[][] grid = new char[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                grid[r][c] = fillValue;
            }
        }
        return grid;
    }
}
