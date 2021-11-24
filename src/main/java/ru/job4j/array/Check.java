package ru.job4j.array;

// В классе Check написать метод public static boolean mono(boolean[] data).
// Метод должен проверить, что все элементы в массиве являются либо true либо false.
// Решение задачи сводится к проверке всех элементов с эталонным. Эталонным можно
// взять любой элемент в массиве. Лучше взять элемент с индексом 0.
// В задании нельзя использовать дополнительный массив.

public class Check {

    public static boolean mono(boolean[] data) {

        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
