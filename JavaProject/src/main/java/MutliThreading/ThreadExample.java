package MutliThreading;

class MyThread extends Thread{


    public MyThread(String name) {

    }

    public void run() {

        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            Thread.sleep(10);
        }catch(InterruptedException e) {
            System.out.println("Thread is Interuppted " + Thread.currentThread().getName() );
        }
        System.out.println("Thread is Exiting " + Thread.currentThread().getName() );
    }
}

public class ThreadExample {
    public static void main(String args[]) {

           MyThread thread=new MyThread("MyThread");
           thread.setPriority(Thread.NORM_PRIORITY);
           thread.start();


            MyThread thread2=new MyThread("MyThread");
            thread2.setDaemon(true);
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread2.start();

            MyThread thread1=new MyThread("Priority Thread");
            thread1.setPriority(Thread.MAX_PRIORITY);
            thread1.start();
        }
    }



