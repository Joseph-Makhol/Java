// Ceci est un jeux de hangman pour les clubs de soccer.
// Ce code est ecrit par Joseph Makhol. Emails: joseph.makhol@yahoo.com et makjos02@ecolecatholique.ca
package Projet8;

import java.util.Scanner;
import java.util.Arrays;
    
    public class pendu{
    
    public static void main(String []args){
    Scanner Input = new Scanner(System.in);
    
    String[] FootClubs = {"simlicy", "joujou", "supercalifragalisticexpialodosious", "bayernmuchen", "brunofernach", "lidzy", "canyougivemethirthydollars", "dish", "fish",};         // Ceci sont tous les choix que l'ordi peut choisir pour que tu devines.
    
        int rndmNum = (int) Math.ceil (Math.random() * FootClubs.length);        
        int score = 10;                           // Tu as 10 vies.
        String rndmClub = FootClubs[rndmNum];       // Ici ca choisi un club au hasard.
    
        char[] rndmLetter = rndmClub.toCharArray();
        char[] rndmLetter2 = rndmClub.toCharArray();
        for (int x = 0; x<rndmLetter.length; x++){
            rndmLetter[x]='*';                      // les asterix sert a demontrer le nombre de lettres.
        }
    
        System.out.println(String.valueOf(rndmLetter));
        System.out.println("Bonjour! Devinez une lettre pour commencer à jouer le jeu. Essayez de deviner le bon club de football!");
        char guessedLetter = Input.next().charAt(0);            // Ici est ou le user commence a interagir avec le jeu.
        int corAnswr = rndmClub.indexOf(guessedLetter);
    
        if (corAnswr >= 0 ){
    
        rndmLetter[corAnswr] = guessedLetter;       // Si le score reste la meme car tu as choisi la bonne lettre, le code printeras la lettre et tu passeras au prochain.
        System.out.println(rndmLetter);
    
        }
    
        if (corAnswr == -1){
            System.out.println("Mauvaise lettre, réessayez.");
            score = score - 1; 
            System.out.println("Nombres de vie: " + score);       // Si le score -1 car tu as choisi la mauvaise lettre, le code printeras, "Mauvaise lettre, réessayez." , et il t'enleve une point.
        }
    
        while (score != 0) {
    
            System.out.println("Devinez une lettre.");      // Ici c'est quand tu passe a la prochain lettre.
            guessedLetter = Input.next().charAt(0);
            corAnswr = rndmClub.indexOf(guessedLetter);
    
    
            if (corAnswr >= 0 ){
    
            rndmLetter[corAnswr] = guessedLetter;
            System.out.println(rndmLetter);
        }
    
            if (corAnswr == -1){
                System.out.println("Mauvaise lettre, réessayez.");
                score = score - 1; 
                System.out.println("Nombres de vie: " + score);       // Si le score -1 car tu as choisi la mauvaise lettre, le code printeras, "Mauvaise lettre, réessayez." , et il t'enleve une point.
        } else {
                System.out.println(rndmLetter);
                while (corAnswr >= 0 ){
                    rndmLetter[corAnswr] = guessedLetter;
                    corAnswr = rndmClub.indexOf(guessedLetter, corAnswr+1); 
                }
        }
    
            boolean result = Arrays.equals(rndmLetter, rndmLetter2);
            if (result == true){                        // Si vous devinez le bon mot alors le jeu s'arrête (break) et vous passez aux lignes 83 et 84.
                break;
            }
    
            if (score == 0){                            // Si vous perdez toutes vos vies, le jeu s'arrête (break) et vous passez aux lignes 78 et 79.
                break;
            }
    
        }
    
        if (score == 0){
            System.out.println("you dumb frick, the correct answer was: " + rndmClub);          // Ce message apparaîtra si vous n'avez plus de vies.
        }
    
        else {
            System.out.println("Bravo! you stupid dish.");     // Ce message apparaîtra si vous deviner le bon club.
            System.out.println("Nombre de vie qui reste: " + score);
        }
    
    }
    
}

