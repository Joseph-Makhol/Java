package Projet5;
 
public class TestEnc {
    public static void main(String[] args){
        Encapsulation vid = new Encapsulation("GTA V", 8, 2021, 2013);
        
        System.out.println("Game's name: " + vid.getName());
        System.out.println("Game's age: " + vid.getAge());
        System.out.println("Year: " + vid.getYear());
        System.out.println("Game's release year: " + vid.getRD());
        // This is the Test hardcode file. It tells you the name, age, present year (2021) and the release year of GTA V.
    }
}
