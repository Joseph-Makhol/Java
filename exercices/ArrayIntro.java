public class ArrayIntro 
{
    public static void main(String[] args )
    {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn", "Uranus", "Neptune"};
        int[] numbers = { 1, 2, 3, 4, 5};

        for (String p : planets) 
        {
            System.out.println(p + "\t" + p.toUpperCase());
        }
        for (int i : numbers)
        {
            System.out.println(i + "\t" + i*2);
        }

    }
}
