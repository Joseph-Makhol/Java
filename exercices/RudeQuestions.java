import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name, title;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your title? " + " Mr. Mrs. " );
        title = keyboard.next();
        
        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + title + " " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );
    }
}

// Question 1:
// No it doesnt blow up but when you put a decimal value when it expects a integer, it blows up.

// Question 2:
// In this case we said name = keyboard.next(); which means that the computer will use whatever 
// character or number you type as name. if we were to put name = keyboard.nextInt(); the we would need to use a full number and 
// not a letter or decimal

// Question 3
// When the program blows up, you have to restart the whole questionnaire. It blows up because a string and a integer are not the same.
// If its asking for a Int (name = keyboard.nextInt();), you cannot put letters or a decimal when its asking for a integer but you
// can put a integer when its asking for a double.

// Question 4:
// My question is in the code!
// Its the title variable with the Mr. and Mrs.