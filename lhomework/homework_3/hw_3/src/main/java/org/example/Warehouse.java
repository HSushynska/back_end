package org.example;

public class Warehouse {
    private String title;
    private int value;
    public static boolean winner = false;
    private Object lock= new Object();

    public Warehouse(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "title='" + title + '\'' +
                ", value=" + value +
                '}';
    }

    public void addValue(int value) {
        synchronized (lock) {
            this.value += value;
        }
}
    public synchronized void winnerLoader(String name) {
        if (!winner) {
            System.out.println("Грузчик " + name + " получит премию!");
            winner = true;
        }
    }
}