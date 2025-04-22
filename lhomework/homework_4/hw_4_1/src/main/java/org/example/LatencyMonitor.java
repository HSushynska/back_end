package org.example;

import java.util.concurrent.atomic.AtomicReference;

public class LatencyMonitor {

    private AtomicReference<Double> minLatency = new AtomicReference<>(Double.MAX_VALUE);

    public void updateLatency (double latency) {
        minLatency.getAndUpdate(current -> Math.min(current, latency));
    }

    public double getMinLatency() {
        return  minLatency.get();
    }
}
