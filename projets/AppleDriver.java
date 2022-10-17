// Ce programme te dit quelle produit apple est le plus recente est combien il coute. Sa aussi additionne tous les prix.
// Ce programme est ecrit par Joseph Makhol. Email: joseph.makhol@yahoo.com ou makjos02@ecolecatholique.ca   
public class AppleDriver {
    public static void main( String[] args ) 
    {
        Double sum;                         // Jai dit au programme de lire le prix total comme double.
        
        ApplePhone one = new ApplePhone();      // Il print le statement du ApplePhone.java file.
        one.phone();                               
            
        desc a = new desc();                    // Sa print que le prix est $999.99 et le variable price est prit du file desc.file.  
        a.price = 999.99;
    
        ApplePad two = new ApplePad();          // Il print le statement du Applepad.java file.
        two.pad();
    
        desc b = new desc();                    // Sa print que le prix est $499.99 et le variable price est prit du file desc.file.
        b.price = 499.99;
    
        AppleMac three = new AppleMac();        // Il print le statement du AppleMac.java file.
        three.mac();
    
        desc c = new desc();                    // Sa print que le prix est $2999.99 et le variable price est prit du file desc.file.
        c.price = 2999.99;
    
        sum = a.price + b.price + c.price;      // On ajoute les prix ensemble.
            
        System.out.println("If you want to get the latest versions of these apple products, it will cost you " + "$" + sum);
            // Cela print le tous les prix additionner.
        }
    }
