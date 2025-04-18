package org.example;

/*
Задача №1
Реализовать 2 потока:
первый поток должен выводить на экран все числа, которые делятся на 2;
второй поток должен выводить все числа которые делятся на 3;
Main должен запускать оба эти потока, засыпать на 3 секунды и завершать выполнение программы
(т.е. оба потока тоже должны прекратить свою работу)
 */

public class Main {
    public static void main(String[] args) {
        EvenThreads thread1 = new EvenThreads();
        ThreeThread thread2 = new ThreeThread();

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FINISH");
    }
}
