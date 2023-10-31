package homework_week_8;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme_6_NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the row number:");
        int numRows = scanner.nextInt();
        scanner.close();
        numberTriangle(numRows);
    }

    public static void numberTriangle(int row) {

        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print( +j + " ");
            }
            System.out.println(" ");
        }
    }
}


