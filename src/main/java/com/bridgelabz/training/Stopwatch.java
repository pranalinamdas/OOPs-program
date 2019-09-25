package com.bridgelabz.training;

import java.util.Date;

public class Stopwatch {

    private long startTime;
    private long stopTime;

    public Stopwatch() {
    }

    public long start() {
        Date date = new Date();
        this.startTime = date.getTime();
        return startTime;
    }

    public long stop() {
        Date date = new Date();
        this.stopTime = date.getTime();
        return stopTime;
    }

    public long elapsedTime() {
        return stopTime - startTime;
    }
}
