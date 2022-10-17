// This program will pick whichever fifa you want.

// This program is written by Joseph Makhol. Email: joseph.makhol@yahoo.com or makjos02@ecolecatholique.ca

import java.io.IOException;

class fifalist {            // One of my classes can be found here. 
    String fifa;            
}

public class projet2{       // My public class can is shown here.
    public static void main(String[] args) throws IOException{          // Here is where I call my first main.
        String MyFifa = "";

        fifalist[] db;              // I made a list called fifalist which will contain all of the fifas from 16-21.
        db = new fifalist[6];       // This shows that there is 6 fifas in the list.

        db [0] = new fifalist();
        db [0].fifa = "Fifa 16";    // At spot 0 which is technically 1 is where fifa 16 can be found.

        db [1] = new fifalist();
        db [1].fifa = "Fifa 17";    // At spot 1 which is technically 2 is where fifa 17 can be found.

        db [2] = new fifalist();
        db [2].fifa = "Fifa 18";    // At spot 2 which is technically 3 is where fifa 18 can be found.

        db [3] = new fifalist();
        db [3].fifa = "Fifa 19";    // At spot 3 which is technically 4 is where fifa 19 can be found.

        db [4] = new fifalist();
        db [4].fifa = "Fifa 20";    // At spot 4 which is technically 5 is where fifa 20 can be found.

        db [5] = new fifalist();
        db [5].fifa = "Fifa 21";    // At spot 5 which is technically 6 is where fifa 21 can be found.

        for (int i=0; i < db.length; i++) {                 // From line 36-44 I used a for each loop to be able to list the fifa you picked.

            if (i == db.length-4){
                MyFifa = db[i].fifa;
                System.out.println(db[i].fifa);
            } else {
                System.out.println(db[i].fifa);
            }
        }
        System.out.println("The best fifa is " + MyFifa);   // Here is how your answer will be printed.
     }
}
