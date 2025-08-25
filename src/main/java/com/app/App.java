package com.app;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // Example 1: Spiral Traversal
        char[][] grid = {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'}
        };

        SpiralTraversal spiral = new SpiralTraversal();
        int[] vowels = spiral.spiralTraverseAndVowels(grid);
        System.out.println("Vowel indices in spiral order: " + Arrays.toString(vowels));

        // Example 2: Cross Traversal / Search
        char[][] board = {
            {'*','M','*','*'},
            {'M','*','M','*'},
            {'*','M','*','*'},
            {'*','*','*','*'}
        };

        int crossCount = CrossTraversal.countSubmatricesWithM(board);
        System.out.println("Number of cross patterns: " + crossCount);
    }
}
