package org.example;

public class Warehouse {
    private String title;
    private int value1;
    private int value2;
    private Object lock= new Object();

    public Warehouse(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "title='" + title + " warehouse1 " + value1 + "warehouse2 "+ value2;

    }


    public  void addValue1(int value){
        synchronized (lock) {
            this.value1 += value1;
        }
    }

    public  void addValue2(int value){
        synchronized (lock) {
            this.value2 += value2;
        }
    }

}

