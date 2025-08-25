package com.app;

import java.util.Arrays;

public class SpiralTraversal {

    private int vowelCount = 0;

    /**
     * Traverses a 2D character grid in spiral order and returns indices of vowels.
     * @param grid 2D array of characters
     * @return indices of vowels in spiral order
     */
    public int[] spiralTraverseAndVowels(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] tempPositions = new int[rows * cols];

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            // Traverse right
            for (int i = left; i <= right; i++) process(grid[top][i], index++, tempPositions);
            top++;
            // Traverse down
            for (int i = top; i <= bottom; i++) process(grid[i][right], index++, tempPositions);
            right--;
            // Traverse left
            if (top <= bottom) for (int i = right; i >= left; i--) process(grid[bottom][i], index++, tempPositions);
            bottom--;
            // Traverse up
            if (left <= right) for (int i = bottom; i >= top; i--) process(grid[i][left], index++, tempPositions);
            left++;
        }

        return Arrays.copyOf(tempPositions, vowelCount);
    }

    private void process(char c, int idx, int[] positions) {
        if ("aeiouAEIOU".indexOf(c) != -1) positions[vowelCount++] = idx;
    }
}
