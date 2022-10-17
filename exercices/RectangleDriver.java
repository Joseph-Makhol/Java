public class RectangleDriver {
    public static void main( String[] args ) {
        // Rectangle r = new Rectangle();
        // r.length = 10;
        // r.width = 5;
        
        Rectangle r = new Rectangle(10, 5);
        System.out.println("The area is " + r.getArea());

        Rectangle v = new Rectangle(5, 6);
        System.out.println("The area is " + v.getArea());

        Rectangle z = new Rectangle(15, 3);
        System.out.println("The area is " + z.getArea());
    } 
}
