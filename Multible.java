public class Multible extends Thread{
//    private int numThread;
//    public Multible(int numThread){
//        this.numThread =numThread;
//    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i /**+ " from thread " + numThread*/);

//            if(numThread == 5)
//            {
//                throw new RuntimeException();
//            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}




