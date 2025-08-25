package com.app;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        char[][] grid = {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'}
        };

        SpiralTraversal spiral = new SpiralTraversal();
        int[] vowels = spiral.spiralTraverseAndVowels(grid);
        System.out.println("Vowel indices in spiral order: " + Arrays.toString(vowels));
    }
}
