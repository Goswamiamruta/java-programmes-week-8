package homework_week_8;
/**
 * Write a metho+d named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * PRIME TESTING
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class Programme_11_EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigit = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigit += lastDigit;
                }

            number /= 10;
        }
        if (originalNumber >= 0) {
            System.out.println("The sum of even digit within a number " + originalNumber + "is equal to:");
        }
        return sumOfEvenDigit;
    }
        System.out.println("Invalid number");
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( getEvenDigitSum(123456789));
        System.out.println( getEvenDigitSum(252));
        System.out.println( getEvenDigitSum(-22));
        int number = scanner.nextInt();
        scanner.close();
    }
}