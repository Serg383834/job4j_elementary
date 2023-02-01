package ru.job4j.io;

public interface Transport {

    void drive();

    void passengers(int count);

    double refuel(double fuel);
}
