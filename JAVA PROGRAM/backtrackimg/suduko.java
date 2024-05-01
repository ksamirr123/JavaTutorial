public class suduko {
    public static boolean solver(int sudukoo[][], int row, int col) {
        if (row == 9 && col == 0) {
            return true;
        }

        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sudukoo[row][col] != 0) {
            return solver(sudukoo, nextrow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudukoo, row, col, digit)) {
                sudukoo[row][col] = digit;
                if (solver(sudukoo, nextrow, nextcol)) {
                    return true;
                }
                sudukoo[row][col] = 0;

            }
        }
        return false;

    }

    public static boolean issafe(int sudukoo[][], int row, int col, int digit) {
        for (int i = 0; i <= 8; i++) {
            if (sudukoo[i][col] == digit) {
                return false;
            }
        }
        for (int j = 0; j <= 8; j++) {
            if (sudukoo[row][j] == digit) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudukoo[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printrr(int sudukoo[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudukoo[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudukoo[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if (solver(sudukoo, 0, 0)) {
            System.out.print("solution exists");
            printrr(sudukoo);
        } else {
            System.out.println("no solution exits");
        }
    }
}
