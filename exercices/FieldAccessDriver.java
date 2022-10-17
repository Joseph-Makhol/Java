public class FieldAccessDriver {
    public static void main( String[] args ) {
        FieldAccess j = new FieldAccess("Robert", "Parker", "Butch");
        FieldAccess z = new FieldAccess("Avery", "Markham", "Sam");
        System.out.println(j.getFullName());
        
        j.setLast("Elliott");
        j.setFirst("Samuel");
        j.setNick("Sam");

        z.setLast("Markham");
        z.setFirst("Avery");
        z.setNick("Sam");

        System.out.println(j.getFullName());
        System.out.println(z.getFullName());
        
        //j.first = "Avery";
        // j.last = "Markham";
        //System.out.println(j.nick);
    }
}
