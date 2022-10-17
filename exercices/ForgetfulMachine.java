import java.util.Scanner;

public class ForgetfulMachine {
    public static void main (String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        keyboard.next();

        System.out.println( "What is 6 times 7?" );
        keyboard.nextInt();

        System.out.println( "Enter a number between 0.0 and 1.0. ");
        keyboard.nextDouble();

        System.out.println( "Is there anything else you would like to say? ");
        keyboard.next();
    }   
}

// Question 1:
// Anything that is not a integer will blow this program up because it wants us to put a integer. It dosen't even 
// have to be the right answer (42), it just has to be a Int.

// Question 2:
// Anything other than an integer or a decimal number will blow this up. Same with the other one it 
// dosen't have to be the right answer.