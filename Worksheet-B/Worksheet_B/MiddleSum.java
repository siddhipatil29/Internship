package Worksheet_B;

public class MiddleSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        int middleRow = matrix.length / 2;
        int middleColumn = matrix[0].length / 2;

        int sumMiddleRow = calculateSumOfRow(matrix, middleRow);
        int sumMiddleColumn = calculateSumOfColumn(matrix, middleColumn);

        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("Sum of middle row (row " + middleRow + "): " + sumMiddleRow);
        System.out.println("Sum of middle column (column " + middleColumn + "): " + sumMiddleColumn);
    }

    public static int calculateSumOfRow(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int col = 0; col < matrix[rowIndex].length; col++) {
            sum += matrix[rowIndex][col];
        }
        return sum;
    }

    public static int calculateSumOfColumn(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][colIndex];
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
