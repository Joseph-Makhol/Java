// Voici le Projet 5 ecrit par Joseph Makhol 
// joseph.makhol@yahoo.com ou makjos02@ecolecatholique.ca
package Projet5;

public class Final {            // This program will take the number you entered and it will calculate the release date of 
                                        // the game you want. It wont know which game but the code will know when it was Ageeased according to your inputs.
    private String GameName;
    private int GameYear;
    private int GameAge;
    private int GameRD;

    public Final(String N, int Age, int Year, int RD){
                                        // Here we're assigning variables to make everything easier to understand.
        GameName = N;
        GameYear = Year;
        GameAge = Age;
        GameRD = RD;
    }

    public int getAge() { return GameAge; }     // Line 21 to 27 are Get methods
 
    public String getName() { return GameName; }    
 
    public int getYear() { return GameYear; }       // Everything accompanied with return is private.
    
    public int getRD() { return GameRD; }       

    // Now we use the set method

    public void setRD(int newRD) { GameRD = newRD; }        // line 31 to 37 are Set methods.
 
    public void setAge(int newAge) { GameAge = newAge; }    
   
    public void setName(String newName) { GameName = newName; }

    public void setYear(int newYear) { GameYear = newYear; }        
    public void Release( int Age){
        int AgeYear = 2021 - Age;       // This subtracts the age that the user enetered from 2021, giving you the release year of the game.
        System.out.println("Your game was released in: " + AgeYear );
    }
}