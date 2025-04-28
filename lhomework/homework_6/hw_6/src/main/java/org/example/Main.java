package org.example;

import java.util.concurrent.TimeUnit;

/*
Возьмите за основу проект demo20250423_1 из пятого урока. Реализуйте перевод денег со счета на счет
без взаимной блокировки (deadlock), используя ReentrantLock. Например, вы можете использовать
timeout при ожидании блокировки.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Account accountA = new Account("DE1111", "Jack", 1000);
        Account accountB = new Account("DE2222", "John", 1000);

        Thread thread1 = new Thread(() -> transfer(accountA, accountB, 100), "T1");
        Thread thread2 = new Thread(() -> transfer(accountB, accountA, 500), "T2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(accountA);
        System.out.println(accountB);

    }

    public static void transfer(Account from, Account to, double amount) {
        Account first = from.hashCode() < to.hashCode() ? from : to;
        Account second = from.hashCode() < to.hashCode() ? to : from;
//lock
        try {
            if (first.getLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    if (second.getLock().tryLock(1, TimeUnit.SECONDS)) {
                        try {
                            from.withdraw(amount);
                            to.deposit(amount);
                            System.out.println(Thread.currentThread().getName() + " перевод совершен " + amount);
                        } finally {
                            second.getLock().unlock();
                        }
                    }

                        } finally{
                            first.getLock().unlock();
                        }
            }

                    } catch(InterruptedException e){
                        Thread.currentThread().interrupt();

                    }
                }
            }










