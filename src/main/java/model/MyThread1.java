package model;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class MyThread1 extends Thread {

        A thatA=null;
        MyThread1 (A a){
            this.thatA=a;

        }
        private int del=0;

        public void run(){
            System.out.println(" MyThread1 running");
            System.out.println(" bef Thread1.currentThread()=" + Thread.currentThread());
            System.out.println(" Thread1.currentThread().isAlive()=" + Thread.currentThread().isAlive());
            try {
                System.out.println(" MyThread1 sleep befr");
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" MyThread1 sleep aft");
            for (int k = 0;k<10;){
                del++;
                k++;
                System.out.println(del);
            }
            del++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("del="+del);
            thatA.method1_checkI(100);
        }
    }

