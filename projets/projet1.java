// Ce programme prend des informations d'un fichier info.txt et les transporte dans un fichier sortie.txt.
// Ce programme est ecrit par Joseph Makhol. Email: joseph.makhol@yahoo.com ou makjos02@ecolecatholique.ca

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class projet1 {
    public static void main( String[] args ) throws Exception {             // L'ordi va ignorer les petit erreurs.
        String jo, j, z;                                                    // Je class les variables
        int a, b, c, d, sum;                                                // dans un string et un integer.

        Scanner fileIn = new Scanner(new File("info.txt"));
        
        a = fileIn.nextInt();                       // Je dis à l'ordinateur de prendre 
        b = fileIn.nextInt();                       // les chaînes et les entiers du fichier info.txt.
        jo = fileIn.nextLine();
        c = fileIn.nextInt();
        j = fileIn.nextLine();
        d = fileIn.nextInt();
        z = fileIn.nextLine();
        
    fileIn.close();                                 // J'ai terminé le processus avec ce commande (fileIn.close();)

    System.out.println("done! To see the ages combined and the heaviest person please check the sortie.txt file, Thank you!");
    sum = b + c + d;
    
    PrintWriter fileout = new PrintWriter("sortie.txt");      // Je dis à l'ordinateur de créer un fichier appelé sortie.txt 
    fileout.println(" The ages combined are " + sum );        // et de placer toutes les informations qu'il a prises dans le fichier info.txt.
    fileout.println(" The heaviest person is" + j );          // Pour voir les résultats, vous allez devoir aller voir le fichier sortie.txt.
    fileout.close();                                          // J'ai terminé le processus avec ce commande (fileout.close();)
    }
}


