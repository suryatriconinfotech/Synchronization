package org.example;

public class TimeSlicingThread extends Thread{
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);  // Adjust this to experiment
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
