class Test extends Thread
{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}


//class Geeks {
//    public static void m1()
//    {
//        System.out.println("Hello Visitors");
//    }
//}
//
//// Here we can extends any other class
//class Test extends Geeks implements Runnable {
//    public void run()
//    {
//        System.out.println("Run method executed by child Thread");
//    }
//    public static void main(String[] args)
//    {
//        Test t = new Test();
//        t.m1();
//        Thread t1 = new Thread(t);
//        t1.start();
//        System.out.println("Main method executed by main thread");
//    }
//}