package ru.job4j.array;
//        Внутри метода main объявите массив int на 5 элементов.
//        Через цикл for заполните его значениями функции y = index * 2 + 3;
//        numbers[index] = index * 2 + 3;
//        Ниже, через цикл for выведите все элементы массива на консоль.

public class ArrayLoop {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        int y = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i * 2 + 3;
        }
        for (int index: intArr) {
            System.out.println(index);
        }       
    }
}
