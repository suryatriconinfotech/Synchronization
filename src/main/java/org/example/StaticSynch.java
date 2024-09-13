package org.example;

class Counter1 {
    private static int count = 0;


    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticSynch {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Counter1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + Counter1.getCount());
    }
}
