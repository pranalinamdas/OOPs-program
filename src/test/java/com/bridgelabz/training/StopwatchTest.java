package com.bridgelabz.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopwatchTest {

private static Date date;
private static Stopwatch stopwatch;

@BeforeEach
void setUp(){
    date = new Date();
    stopwatch = new Stopwatch();
}

    @Test
    void givenStartTime_WhenCalledStartStopWatch_ThenShouldReturnCurrentTime(){
        assertEquals(date.getTime(), stopwatch.start());
    }

    @Test
    void givenStopTime_WhenCalledStopStopwatch_ThenShouldReturnCurrentTime(){
        assertEquals(date.getTime(), stopwatch.stop());
    }

    @Test
    void givenZeroStartTimeAndZeroStopTime_WhenCalculateElapsedTime_ThenShouldReturnZero(){
        Stopwatch calculate = new Stopwatch(date.getTime(), date.getTime());
        assertEquals(0, calculate.elapsedTime());
    }

    @Test
    void givenStartAndStopTime_WhenCalculateElapsedTime_ThenShouldReturnElapsedTimeNBetweenStartAndStop(){
        long start = date.getTime();
        long stop = date.getTime();
        Stopwatch calculate = new Stopwatch(start, stop);
        assertEquals(stop - start,calculate.elapsedTime());
    }
}
