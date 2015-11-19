package model;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class MyThread2 implements Runnable {

        public void run(){
            System.out.println("MyThread2 running");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("MyThread2 except=" + e.getMessage());
            }


        }
    }

