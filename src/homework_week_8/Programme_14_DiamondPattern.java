package homework_week_8;

import java.util.Scanner;

/**
 * write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();
        scanner.close();
        if (numRows % 2 ==0) {
            System.out.println("Please enter an odd number of rows");
        }else{
            printDiamondPattern(numRows);
        }
    }
    public static void printDiamondPattern(int numRows){
        int midRow = numRows / 2;
        int i = 0;

        //Print the top half of diamond
        while(i <=midRow){
            int j = 0;
            while(j < midRow - i){
                System.out.print(" ");
                j++;
            }
            j = 0;
            while(j < 2 * i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // Print the bottom half of the diamond
        i = midRow - 1;
        while (i >= 0){
            int j = 0;
            while (j < midRow - i){
                System.out.print(" ");
                j++;
            }
            j = 0;
            while(j<2 * i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
        }







