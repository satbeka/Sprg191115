package model;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class MyThread2 implements Runnable {

        public void run(){
            System.out.println("  MyThread2 running");
            try {
                System.out.println("  Thr2 bef sleep");
                System.out.println("  bef sleep Thread2.currentThread()=" + Thread.currentThread());
                System.out.println("  bef sleep Thread2.currentThread().isAlive()=" + Thread.currentThread().isAlive());
                //Thread.currentThread().interrupt();
                        Thread.sleep(10000);
                A a=new A();
                a.method1_checkI(500);

                System.out.println("  aft Thread2.currentThread().isAlive()=" + Thread.currentThread().isAlive());
                System.out.println("  Thr2 aft sleep");
            } catch (InterruptedException e) {
                System.out.println("  excep Thread2.currentThread().isAlive()=" + Thread.currentThread().isAlive());
                System.out.println("  MyThread2 except=" + e.getMessage());
            }
            System.out.println("  end Thread2.currentThread().isAlive()=" + Thread.currentThread().isAlive());

        }
    }

