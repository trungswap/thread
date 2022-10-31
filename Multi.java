public class Multi{
    public static void main(String[] args)
    {
//        for(int i =0 ; i<=5;i++) {
//            Multible myThing1 = new Multible(i);
//            myThing1.start();
//        }
        Multible myThing1 = new Multible();
        Multible myThing2 = new Multible();

        myThing1.start();
        myThing2.start();
    }
}
