public class TweetDriver {
    public static void main( String[] args ) {
        Tweet t = new Tweet( "Thu Feb 19 20:29:00 +0000 2105", 8, true,
        568507566168223744L, 2, false,
            "You can now buy 'Learn Java the Hard Way' using bitcoin! Probably!"
            + "\nThanks, @stripe ! #ljthw"
        );
        
        System.out.println( t.hi() );
        System.out.println("\n------------------------\n");
        System.out.println( t );
    }
}
// Question 1:
// It runs the same way if i put "this" in front of the fields that did not have it in the first place.

// Questiom 2:
// The error message I get is "The literal 568507566168223744 of type int is out of range"

// Question 3:
// The program runs the same if I put a capital or lower case L. You can put whatever number you want, you just need the letter L after.

// Question 4:
// In the Tweet.java file I renamed it to hi (was toString) and in this file on line 11 I changed it from t.toString to t.hi and it runs the exact same way
// because we changed it in both areas. Its only a name which means that we can set it to whatever we'd like. We just have to make sure that its 
// the same everywhere else in all our codes that Correspond to this exercise.
