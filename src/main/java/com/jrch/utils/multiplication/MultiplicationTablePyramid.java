package com.jrch.utils.multiplication;

/**
 * 九九乘法表，左侧对齐输出。
 */
public class MultiplicationTablePyramid {

    private static final int SIZE = 9;
    private static final int CELL_WIDTH = 8;

    public static void main(String[] args) {
        printPyramidTable();
    }

    public static void printPyramidTable() {
        for (int row = 1; row <= SIZE; row++) {
            printRow(row);
            System.out.println();
        }
    }

    private static void printRow(int row) {
        for (int col = 1; col <= row; col++) {
            String item = col + "*" + row + "=" + (col * row);
            System.out.printf("%-" + CELL_WIDTH + "s", item);
        }
    }
}
