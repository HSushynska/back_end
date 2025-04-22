package org.example;

/*
Компания разрабатывает систему мониторинга производительности веб-сервисов.
Один из важных показателей — минимальная задержка ответа (latency) от сервера.
Нужно реализовать компонент LatencyMonitor, который отслеживает самое минимальное время отклика,
полученное из множества параллельных потоков, поступающих от разных серверов/кластеров.
Задержка - случайное целое число (мс), в диапазоне от 0 до Integer.MAX_VALUE.
Каждый из N потоков-серверов генерирует это число и вызывает метод updateLatency(double latency)
класса LatencyMonitor. Реализация не должна использовать synchronized или
блокировки — только атомарные структуры (Atomic*).
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        LatencyMonitor monitor = new LatencyMonitor();
        int N = 5;
        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(() -> {double latency = Math.random() * Double.MAX_VALUE;
            monitor.updateLatency(latency);
            });

            threads[i].start();
        }

        for (int i = 0; i < N; i++) {
            threads[i].join();
        }

        System.out.println(monitor.getMinLatency());

    }
}