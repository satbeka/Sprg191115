package model;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class Runner {
    public static void main(String[] args) {

        System.out.println("start current="+Thread.currentThread());
        Thread thread1=new Thread(new MyThread1());

        Thread thread2=new Thread(new MyThread2());

        thread1.start();
        thread2.start();
        System.out.println("start eeee current=" + Thread.currentThread());
        try {
            System.out.println("sleep ");
            Thread.sleep(10000);
            System.out.println("thread1.isAlive()=" + thread1.isAlive());
            System.out.println("thread2.isAlive()="+thread2.isAlive());
        } catch (InterruptedException e) {
            System.out.println("sleep exep=" + e.getMessage());
        }

        System.out.println("aft sleep thread1.isAlive()=" + thread1.isAlive());
        System.out.println("aft sleep thread2.isAlive()="+thread2.isAlive());


    }
}
