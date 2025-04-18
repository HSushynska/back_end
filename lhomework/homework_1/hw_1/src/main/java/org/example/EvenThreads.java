package org.example;

public class EvenThreads extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Делится на 2: " + i);
            }
        }
    }
}
