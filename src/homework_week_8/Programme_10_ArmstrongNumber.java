package homework_week_8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3) = 27
 * so:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
