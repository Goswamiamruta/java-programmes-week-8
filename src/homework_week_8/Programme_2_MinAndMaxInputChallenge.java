package homework_week_8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static boolean hasNextInt(Scanner scanner) {
        return scanner.hasNextInt();
    }
        public static int nextInt(Scanner scanner){
            return scanner.nextInt();
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstNumber = true;

        while (true){
            System.out.println("Enter number:");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();

                if(firstNumber){
                    min = number;
                    max = number;
                    firstNumber = false;
                }else{
                    if(number<min){
                        min = number;
                    }
                    if(number> max){
                        max = number;
                    }
                }
            }else{
                break; // exit the loop on invalid number
            }
            scanner.nextLine(); //Move to next line to enter key
        }
    if (!firstNumber){
        System.out.println("Minimum number:" +min);
        System.out.println("Maximum number:" +max);
    }else{
        System.out.println("No valid number enter.");
    }
      scanner.close();
    }

}
