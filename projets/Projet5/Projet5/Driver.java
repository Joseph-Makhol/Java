package Projet5;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter the age of your game to see what year it was released."); // You need to enter the age of your game and it will give you the year it was released.
        int Age = Keyboard.nextInt();
        Final obj = new Final("GTA V", 8, 2021, 2013);
        
        obj.Release(Age);

    }
}
