package wk8a;

public class Lec3 {
    public static void main(String[] args) {
        char[][] grid = new char[5][10];
        grid[0][0] = '5';
        grid[1][1] = '3';
        grid[2][2] = '8';
        print(grid);
    }

    private static void print(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }
}
