package com.app;

public class CornerTraversal {

    /**
     * Counts how many 3x3 regions in the board have 'R' characters in all four corners and not in the center.
     *
     * Example pattern:
     *   R * R
     *   * * *
     *   R * R
     *
     * @param board A 2D character matrix
     * @return The count of 3x3 submatrices with 'R's in the corners
     */
    public static int countSubmatricesWithR(char[][] board) {
        int count = 0;

        if (board.length < 3 || board[0].length < 3) {
            return 0;
        }

        // Loop through all valid center cells of a 3x3 matrix
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length - 1; j++) {
                if ((board[i - 1][j - 1] == 'R') &&  // top-left
                    (board[i - 1][j + 1] == 'R') &&  // top-right
                    (board[i + 1][j - 1] == 'R') &&  // bottom-left
                    (board[i + 1][j + 1] == 'R'))    // bottom-right
                {
                    count++;
                }
            }
        }

        return count;
    }
}
