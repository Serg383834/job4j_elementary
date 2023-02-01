package ru.job4j.io;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("The bus is coming");
    }

    @Override
    public void passengers(int count) {
        System.out.println("There are " + count + " passengers on the bus");
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 50;
    }
}
