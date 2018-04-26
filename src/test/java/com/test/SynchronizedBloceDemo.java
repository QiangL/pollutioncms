package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class SynchronizedBloceDemo {

    public static void main(String[] args) {
        son son=new son(2);
    }

}

class father{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class son extends father{
    public son(int a){
        this.setA(a);
        System.out.println(this.getA());
    }
}

