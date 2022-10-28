//class unDongbo {
//    void printTable(int n) {// method không synchronized
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//    }
//}
//
//class Dongbohoa1 extends Thread {
//    unDongbo t;
//
//    Dongbohoa1(unDongbo t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(5);
//    }
//}
//
//class MyThread2 extends Thread {
//    unDongbo t;
//
//    MyThread2(unDongbo t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(100);
//    }
//}
//
//public class Dongbohoa {
//    public static void main(String args[]) {
//        unDongbo obj = new unDongbo();
//        Dongbohoa1 t1 = new Dongbohoa1(obj);
//        MyThread2 t2 = new MyThread2(obj);
//        t1.start();
//        t2.start();
//    }
//}




class Table {
    synchronized void printTable(int n) { // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

//class MyThread1 extends Thread {
//    Table t;
//
//    MyThread1(Table t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(5);
//    }
//}
//
//class MyThread2 extends Thread {
//    Table t;
//
//    MyThread2(Table t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(100);
//    }
//}
//
//public class Dongbohoa {
//    public static void main(String args[]) {
//        Table obj = new Table();// tao mot object
//        MyThread1 t1 = new MyThread1(obj);
//        MyThread2 t2 = new MyThread2(obj);
//        t1.start();
//        t2.start();
//    }
//}