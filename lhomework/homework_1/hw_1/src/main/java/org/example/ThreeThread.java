package org.example;

public class ThreeThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
        }
    }
}
