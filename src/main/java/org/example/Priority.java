package org.example;

public class Priority {
    public static void main(String[] args) {



        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();
        PriorityThread t4 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
