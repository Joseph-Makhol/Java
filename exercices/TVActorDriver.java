public class TVActorDriver {
    public static void main(String[] args)
    {
        int sum;

        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.age = 20;

        TVActor b = new TVActor();
        b.name = " Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.age = 30;

        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.age = 40;

        sum = a.age + c.age + b.age;

    System.out.println( a.name + " Played " + a.role);
    System.out.println( b.name + " Played " + b.role);
    System.out.println( c.name + " Played " + c.role);
    System.out.println( "The ages combined of all these actors is " + sum + " years old!");
    
    }
}
