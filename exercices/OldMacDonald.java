class Cow {
    public void moo() {
        System.out.println("Cow says moo.");
    }
}
    
class Pig {
    public void oink() {
        System.out.println("Pig says oink.");
    }
}
    
class Duck {
    public void quack() {
        System.out.println("Duck says quack.");
    }
}

class Tiger {
    public void rawr(){
        System.out.println("Tiger says rawr.");
    }
}


public class OldMacDonald {
    public static void main( String[] args ) {
    
        Cow maudine = new Cow();
        Cow pauline = new Cow();
        maudine.moo();
        pauline.moo();

        Duck ferdinand = new Duck();
        ferdinand.quack();

        Pig snowball = new Pig();
        snowball.oink();
        snowball.oink();

        Tiger tony = new Tiger();
        tony.rawr();

    }
}


// Question 1:
// When you move the duck comment anywhere under the OldMacDonald class, it ill will work 
// in the order that its in. It will print whatever is first under that class.

// Question 2:
// I created a class called tiger and I created a methode to make it say that the tiger says rawr.
