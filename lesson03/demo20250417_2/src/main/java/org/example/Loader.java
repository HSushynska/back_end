package org.example;

public class Loader implements Runnable{

    private String name;
    private int nBox; // план
    private int capacity; // сколько за раз коробок
    private Warehouse warehouse; // на какой склад
    private int done = 0; // сколько уже перенес

    public Loader(String name, int nBox, int capacity, Warehouse warehouse) {
        this.name = name;
        this.nBox = nBox;
        this.capacity = capacity;
        this.warehouse = warehouse;
    }


    @Override
    public void run() {
    while (done<nBox){
    int value = Math.min(nBox - done, capacity);
    warehouse.addValue(value);
    done+=capacity;
}

        System.out.println(name + " finish. Get: " + done + " boxes");
    }
}
