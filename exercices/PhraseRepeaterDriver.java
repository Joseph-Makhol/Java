import java.util.Scanner;

public class PhraseRepeaterDriver {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = keyboard.nextLine();
        System.out.print("Number of times: ");
        int n = keyboard.nextInt();

        PhraseRepeater pr = new PhraseRepeater();
        pr.setValues(msg, n);


        System.out.println( pr.getRepeatedPhrase() );
    }
}
// Question 1:
// We made this program in a way so that on line 13 it will Expect (String, int). If we put (n, msg) we are Basically saying that n is a string but its not.