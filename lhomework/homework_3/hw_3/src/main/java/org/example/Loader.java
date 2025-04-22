package org.example;

import java.util.Random;

public class Loader implements Runnable {

    private String name;
    private int nBox;
    private int capacity;
    private Warehouse warehouse;
    private int done = 0;


    public Loader(String name, int nBox, int capacity, Warehouse warehouse) {
        this.name = name;
        this.nBox = nBox;
        this.capacity = capacity;
        this.warehouse = warehouse;
    }


    @Override
    public void run() {
        while (done < nBox){
            warehouse.addValue(capacity);
            done+=capacity;
            try {
                Thread.sleep((new Random().nextInt(11) + 5));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(name + " finish. Get: " + done + " boxes");
    }
}
