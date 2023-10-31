package homework_week_8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    int a = 1;
    int b = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter the number of Fibonacci number to Display:");
        int n = scanner .nextInt();


        int a = 1, b = 1;
        System.out.print("Fibonacci Sequence:");
        for (int i = 1;i<=n; i++){
            System.out.print(a + "");
            int next = a +b ;
            a = b ;
            b = next;
        }
    }

}
