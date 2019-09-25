package com.bridgelabz.training;

import java.util.Scanner;

public class CalculateElapsedTime extends Stopwatch {

    public CalculateElapsedTime(){ }

    public static void main(String args[]){
        Stopwatch stopwatch = new Stopwatch();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to start stopwatch: ");
        sc.next();
        stopwatch.start();

        System.out.println("Enter key to stop stopwatch: ");
        sc.next();
        stopwatch.stop();

        long elapsedTime = stopwatch.elapsedTime();
        System.out.println("Elapsed time between start and stop : "+elapsedTime);
    }
}
