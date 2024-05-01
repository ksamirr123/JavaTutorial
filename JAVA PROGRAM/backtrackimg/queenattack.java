//time complexity of nqueens = O(n!)
public class queenattack {
    public static void queens(char board[][], int row) {
        if (row == board.length) {
            printrr(board);
            return;
        }
        if (issafe(board, row, col)) {
            for (int j = 0; j < board.length; j++) {
                board[row][j] = 'Q';
                queens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static void printrr(char board[][]){
        System.out.print("CHESS------__++CHESS--")
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+",");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[row][col] == 'Q') {
                return false;
            }
        }
        // left vertical diogonal
        for (int i = row - 1, j = col - 1; i > 0 && j >= 0; i--, j--) {
            if (board[row][col] == 'Q') {
                return false;
            }

        }
        // right vertical dioganal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[row][col] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }

        }
        queens(board, 0);
    }
}
