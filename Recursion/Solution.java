import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValid(board);
    }

    public static boolean isValid(char[][] board) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) return false;
                    row.add(board[i][j]);
                }

                if (board[j][i] != '.') {
                    if (col.contains(board[j][i])) return false;
                    col.add(board[j][i]);
                }

                int rowIdx = 3 * (i / 3) + j / 3;
                int colIdx = 3 * (i % 3) + j % 3;

                if (board[rowIdx][colIdx] != '.') {
                    if (box.contains(board[rowIdx][colIdx])) return false;
                    box.add(board[rowIdx][colIdx]);
                }
            }
        }

        return true;
    }
}
