package DesignPatterns;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args){

        //Builder Design pattern
        Car.CarBuilder cb = new Car.CarBuilder();
        Car bmw = cb.setWheels(5)
                .setEngine("v8")
                .setColor("red")
                .build();

        System.out.println(bmw);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() -> Logger.getLogger());
        executor.execute(() -> Logger.getLogger());
        executor.execute(() -> Logger.getLogger());
        executor.execute(() -> Logger.getLogger());
        executor.execute(() -> Logger.getLogger());
        executor.execute(() -> Logger.getLogger());

        executor.close();
    }
}
