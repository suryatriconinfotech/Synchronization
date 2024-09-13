package org.example;

public class FIFO {
    public static void main(String[] args) {

        FIFOthread t1 = new FIFOthread();
        FIFOthread t2 = new FIFOthread();
        FIFOthread t3 = new FIFOthread();

        t1.start();
        t3.start();
        t2.start();
    }
}