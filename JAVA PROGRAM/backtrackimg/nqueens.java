//for without attacking each of them
public class nqueens {
    public static void queens(char board[][], int row) {
        if (row == board.length) {
            printrr(board);
            return;
        }

        if (issafe(board, row, j)) {
            for (int j = 0; j < board.length; j++) {
                board[row][j] = 'Q';
                queens(board, row + 1);
                board[row][j] = 'X';

            }
        }
    }

    public static void printrr(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;

        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        queens(board, 0);
    }
}