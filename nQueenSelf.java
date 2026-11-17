public class nQueenSelf {
    public static void nQueen(char board[][], int i) {
        if (i >= board.length) {
            printBoard(board);
            System.out.println();
            return;
        }
        for (int j = 0; j < board.length; j++) {
            board[i][j] = 'Q';
            System.out.println("i : " + i + " j : " + j);
            nQueen(board, i + 1);
            board[i][j] = '-';
        }
    }

    public static boolean isSafe(char board[][], int i, int j) {
        for (int k = 0; k < i; k++) {
            if (board[k][j] == 'Q') {
                return false;
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("  "+board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        // printBoard(board);
        nQueen(board, 0);
    }
    
}
