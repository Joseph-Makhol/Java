public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, z;
        double seconds, e, checking, day;
        String firstName, lastName, title, age, email;

        x = 10;
        y = 400;
        z = 50; 
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        day = 2.35;
        
        firstName = "Joseph";
        lastName = "Makhol";
        title = "Mr.";
        age = "19";
        email = "joseph.makhol@yahoo.com";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The variable z contains " + z );
        System.out.println( "the experiment took " + seconds + " seconds.");
        System.out.println( "A favorite irrational # is Eyler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "its " + day + "pm" );
        System.out.println( "My name is " + title + " " + firstName + " " + lastName );
        System.out.println( "Im " + age + " years old");
        System.out.println( "My email is " + email );
    }
}

