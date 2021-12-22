package Backtracking;

/*
URL: https://leetcode.com/problems/n-queens/
 */

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public List<String> construct(char board[][]) {
        List<String> result = new ArrayList<String>();

        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            result.add(s);
        }

        return result;
    }

    public void solve(int column, char board[][], List<List<String>> result, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        if(column == board.length) {
            result.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++) {
            if(leftRow[row] == 0
            && lowerDiagonal[row + column] == 0
            && upperDiagonal[board.length - 1 + column - row] == 0) {
                board[row][column] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + column] = 1;
                upperDiagonal[board.length - 1 + column - row] = 1;

                solve(column + 1, board, result, leftRow, lowerDiagonal, upperDiagonal);

                board[row][column] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + column] = 0;
                upperDiagonal[board.length - 1 + column - row] = 0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        //
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        solve(0, board, result, leftRow, lowerDiagonal, upperDiagonal);
        //

        return result;
    }

    public static void main(String[] args) {
        int n = 4;

        NQueen nQueen = new NQueen();
        nQueen.solveNQueens(n);
    }
}
