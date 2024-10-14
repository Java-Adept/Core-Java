package MutliThreading;
 class TestThread {
    public  synchronized  static void display(int num) {

            for (int i = 0; i <= 5; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(50);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}

class MyThread1 extends Thread {
    TestThread t;

    MyThread1(TestThread t) {
        this.t = t;
    }

    public void run() {
        t.display(8);

    }
}

class MyThread2 extends Thread{
    TestThread t;
    MyThread2(TestThread t) {
        this.t = t;
    }
    public void run() {
        t.display(8);
    }

}
public class WithoutSynchronization {

     public static void main(String args[]) {
         TestThread t=new TestThread();
          MyThread1 t1 = new MyThread1(t);
         MyThread2 t2 = new MyThread2(t);
         t1.start();
         t2.start();
     }
}