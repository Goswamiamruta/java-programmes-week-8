package homework_week_8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the right angle triangle:");
        int height = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "@" );
            }
            System.out.println(" ");
        }
    }
}
