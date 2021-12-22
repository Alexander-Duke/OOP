package com.company.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int y = 10;
        int x = 10;
        int[][] array = new int[y][x];
        for (int i = 0; i< y; i++) {
            for (int j = 0; j< x; j++) {
                array[i][j] = j+1+(x*i);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println("");
        }
    }
}
