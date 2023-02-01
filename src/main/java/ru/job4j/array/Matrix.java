package ru.job4j.array;

//   Добавьте в класс метод public static int[][] multiple(int size)
//   size - указывает на размер таблицы. В ячейки массива нужно записать элементы
//   таблицы умножения.
//   Элементы получать перемножением индексов.
//   Например, если size = 9, у вас должна получиться таблица усножения 9 на 9.

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiply = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                multiply[row][cell] = (row + 1) * (cell + 1);

            }
        }
        return multiply;
    }
}
