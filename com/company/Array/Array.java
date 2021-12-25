package com.company.Array;

import java.util.Scanner;
import java.lang.Math;
import static com.company.Array.constants.ArrayMessages.*;

public class Array {
    private final Scanner scanner = new Scanner(System.in);
    private String usersInput = "";
    private int numberOfColumns, numberOfLines;
    private static Array array;

    private Array() {
    }

    public static Array getInstance() {
        if (array == null) {
            array = new Array();
        }
        return array;
    }

    public void startArray() {
        System.out.println(WELCOME_MESSAGE);
        while (!usersInput.contains(EXIT_MESSAGE)) {
            isIncorrectInput = true;
            char[][] array = createMatrix();
            fillingTheMatrixRandomChar(array);
            printMatrix(array);
            System.out.println(RETRY_OR_FINISH_MESSAGE);
            usersInput = scanner.nextLine();
            usersInput = scanner.nextLine();
        }
    }

    private void fillingTheMatrixRandomChar(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int num = randomWithRange(33,126);
                char charNum = (char) num;
                array[i][j] = charNum;
            }
        }
    }

    private void printMatrix(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3c",array[i][j]);
            }
            System.out.println("");
        }
    }

    private char[][] createMatrix() {
        System.out.print(ENTER_THE_NUMBER_OF_COLUMNS);
        enterTheNumberOfColumns();
        System.out.print(ENTER_THE_NUMBER_OF_LINES);
        enterTheNumberOfLines();
        char[][] array = new char[numberOfLines][numberOfColumns];
        return array;
    }

    private void enterTheNumberOfLines() {
        numberOfLines = scanner.nextInt();
    }

    private void enterTheNumberOfColumns() {
        numberOfColumns = scanner.nextInt();
    }

    int randomWithRange(int min, int max){

        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
