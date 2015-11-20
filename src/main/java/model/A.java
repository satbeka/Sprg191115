package model;

import java.sql.Date;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class A {

    private volatile int i=0;
    private String str="A10000000000001AAA";
    private Date dt;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public synchronized void method1_checkI(int bb){
        i++;
        i=i+bb;

        i=i+100;
        System.out.println("     i="+i);
        System.out.println("     A Thread.currentThread().getName()="+Thread.currentThread().getName());
        return;
    }

    public static void method2_checkI(int bb){
        int i=0;
        i++;
        i=i+bb;

        i=i+100;
        i=i+method21_checkI(i);
        System.out.println("     i="+i);
        System.out.println("     2   A Thread.currentThread().getName()="+Thread.currentThread().getName());
        return;
    }

    public static int method21_checkI(int bb){
        int i=0;
        i++;
        i=i+bb;

        i=i+100;
        System.out.println("     i="+i);
        System.out.println("     21  A Thread.currentThread().getName()="+Thread.currentThread().getName());
        return i;
    }


    public void method2_checkStr(){
        str=str+"jkoAAAlhgtt-+96---";

        System.out.println("str="+str);

        return;
    }


}
