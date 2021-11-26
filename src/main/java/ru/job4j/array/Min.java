package ru.job4j.array;

// В этом задании нужно найти минимальное число в массиве

public class Min {
    public static int findMin(int[] array) {

        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
