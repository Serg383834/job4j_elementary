package ru.job4j.array;

// Заполните массив цифрами от 1 до 9.

public class Sequence {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = num;
                num++;
                System.out.println(array[i][j]);
            }
        }
    }
}
