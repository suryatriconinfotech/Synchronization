package org.example;

class PriorityThread extends Thread {
    public void run() {

            System.out.println(Thread.currentThread().getName() + " (Priority: " + getPriority() + "): ");

    }
}