import java.util.Scanner;

public class ArrayLinearSearch {

    public static void main (String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
        int toFind;

        {
            System.out.println("nope");
        }
        

        System.out.print("There are " + orderNumbers.length);
        System.out.println(" orders in the database.");

        System.out.println("Orders: ");
        for ( int num : orderNumbers)
        {
            System.out.println( num + " ");
        }
        System.out.println();

        System.out.println("Which order to find?");
        toFind = keyboard.nextInt();

        for ( int num : orderNumbers )
        {
            if ( num == toFind )
            {
                System.out.println( num + " found. ");
                

            }
            else;
            System.out.println("Error, Try Again");                 
            break;                          
        }    
        
    }

} 

// Question 1:
// non, nous ne pouvons pas faire cela. Sur le terminal ca dit "error: bad initializer for for-loop"


// Question 2:
// Je vous l'ai déjà envoyé et je n'ai pas répondu à cette question, mais après quelques recherches, j'ai pu comprendre the break statement.
// Comme vous pouvez le voir, avec l'instruction break, le programme n'imprimera le message qu'une seule fois, 
// puis sortira de la boucle. si je n'ai pas mis l'instruction break, le programme aurait imprimé le message d'erreur autant 
// de fois qu'il y a de "orderNumbers" (6 fois).   

