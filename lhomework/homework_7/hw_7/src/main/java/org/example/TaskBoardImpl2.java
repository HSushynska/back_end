package org.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskBoardImpl2 implements TaskBoard {
    private int task = 0;

    private Lock lock = new ReentrantLock();
    private Condition managerCondition = lock.newCondition();
    private Condition workerCondition = lock.newCondition();


    @Override
    public void setTask(int task) {
        lock.lock();
        try {
            while (this.task >= 5) {
                try {
                    managerCondition.await();         // !!!! не wait()
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.task += task;
            workerCondition.signal();   // !!!!  не notify()

        } finally {
            lock.unlock();
        }
    }

    @Override
    public int getTask() {
        lock.lock();
        try {
            while (task < 1) {
                try {
                    workerCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int result = task ;
            task --;
            managerCondition.signal();
            return result;

        } finally {
            lock.unlock();
        }

    }
}

