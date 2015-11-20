package model;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class Runner {
    public static void main(String[] args) {

        System.out.println("start current="+Thread.currentThread());
        //Thread thread1=new Thread(new MyThread1());
        A a=new A();
        MyThread1 thread1=new MyThread1(a);
        thread1.setName("Trhed1");
        MyThread1 thread12=new MyThread1(a);
        thread12.setName("Trhed12");




        Thread thread2=new Thread(new MyThread2());
        MyThread1 thread13=new MyThread1(a);
        thread13.setName("Trhed13");


        thread1.start();
        thread12.start();
        thread2.start();
        thread13.start();

        System.out.println("      befr join Thread.currentThread().State=" + Thread.currentThread().getState().toString());
        System.out.println("      befr join Thread12.isAlive()=" + thread12.isAlive());
        try {
            thread12.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("      aft join Thread.currentThread().State=" + Thread.currentThread().getState().toString());
        System.out.println("      aft join Thread12.isAlive()=" + thread12.isAlive());



        System.out.println("start eeee current=" + Thread.currentThread());
        try {
            System.out.println("Thread sleep ");
            Thread.sleep(1000);
            System.out.println("aft Thread.currentThread()=" + Thread.currentThread());
            System.out.println("aft Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
            System.out.println("aft thread1.isAlive()=" + thread1.isAlive());
            System.out.println("aft thread2.isAlive()="+thread2.isAlive());
        } catch (InterruptedException e) {
            System.out.println("sleep exep=" + e.getMessage());
        }

        System.out.println("end sleep thread1.isAlive()=" + thread1.isAlive());
        System.out.println("end sleep thread2.isAlive()="+thread2.isAlive());



    }
}
