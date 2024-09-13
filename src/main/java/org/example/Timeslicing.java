package org.example;

public class Timeslicing {
    public static void main(String[] args) {

        TimeSlicingThread t1 = new TimeSlicingThread();
        TimeSlicingThread t2 = new TimeSlicingThread();
        TimeSlicingThread t3 = new TimeSlicingThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
