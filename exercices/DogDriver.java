public class DogDriver {
    public static void main( String[] args ) {
        Dog a = new Dog();
        
        Dog pal = new Dog("Lassie", "Rough Collie", 3, 26);
        Dog spike = new Dog("Yeller", "Mastador", 5, 43);
        Dog joe = new Dog("Joe", "Golden Retriever", 7, 40.5);
        
        System.out.println( pal.getName() + " is a " + pal.getBreed() + ".");
        System.out.println( spike.getName() + " is a " + spike.getBreed() + ".");
        System.out.println( joe.getName() + " is a " + joe.getBreed() + ".");
        
        System.out.println( pal.getEverything() );
        System.out.println( spike.getEverything() );
        System.out.println( joe.getEverything() );
    }
}
