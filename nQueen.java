public class nQueen {
    public static void nQueenProblem(char chessboard[][], int row) {
        if (row == chessboard.length) {
            printchessBoard(chessboard);
            return;
        }
        for (int i = 0; i < chessboard.length; i++) {
            chessboard[row][i] = 'Q';
            nQueenProblem(chessboard, row+1);
            chessboard[row][i] = '-';
        }
    }

    public static void printchessBoard(char chessboard[][]) {
        //printing chess board
        System.out.println("------chessBoard------");
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print("  " + chessboard[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char chess[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '-';
            }
        }
        nQueenProblem(chess, 0);
    }
}