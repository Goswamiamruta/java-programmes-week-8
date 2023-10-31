package homework_week_8;

import java.util.Scanner;

/**
 *3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input an alphabet:");
        String Letter = scanner.next();

        //// Convert to lowercase for comparison
if (scanner.hasNext()){
    Letter = Letter.toLowerCase();
    if (Letter.equals("a")||Letter.equals("e")||Letter.equals("i")||Letter.equals("o")||Letter.equals("u")){
        System.out.println(" Input letter is a Vowel");
    } else if (Letter.length() > 1 ){
        System.out.println("Error: Please enter a valid alphabet letter");

    }else {
        System.out.println("Input letter is a Consonant");
    }
    }else{
        System.out.println("Error: please enter a singe letter input");
    }
    scanner.close();
}

    }

