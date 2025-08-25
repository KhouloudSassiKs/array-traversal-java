package com.app;

/**
 * Implements cross-shaped traversal and search patterns on 2D arrays.
 */
public class CrossTraversal {

    /**
     * Counts how many 3x3 regions in the board contain a cross-shaped pattern
     * with 'M' characters on the top, bottom, left, and right of the center.
     *
     * Example pattern:
     *   * M *
     *   M * M
     *   * M *
     *
     * @param board A 2D character matrix
     * @return The count of cross-shaped patterns with 'M's in the arms
     */
    public static int countSubmatricesWithM(char[][] board) {
        int count = 0;

        // Edge case: not enough rows or columns to form a 3x3 matrix
        if (board.length < 3 || board[0].length < 3) {
            return 0;
        }

        // Loop through all valid center cells of a 3x3 matrix
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length - 1; j++) {

                // Check the 4-arm positions for 'M'
                if ((board[i][j - 1] == 'M') &&    // left
                    (board[i][j + 1] == 'M') &&    // right
                    (board[i - 1][j] == 'M') &&    // top
                    (board[i + 1][j] == 'M'))      // bottom
                {
                    count++;
                }
            }
        }

        return count;
    }
}
