package model;

import java.sql.Date;

/**
 * Created by SAbdikalikov on 19.11.2015.
 */
public class A {

    private int i=0;
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

    public void method1_checkI(){
        i++;
        i=i+10;
        System.out.println("i="+i);
        return;
    }

    public void method2_checkStr(){
        str=str+"jkoAAAlhgtt-+96---";

        System.out.println("str="+str);
        return;
    }


}
