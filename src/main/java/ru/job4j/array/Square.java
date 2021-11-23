package ru.job4j.array;

//        Реализуйте метод заполнения массива степенями чисел
//        В методе задается параметр bound. Он определяет,
//        до какого  числа нужно записывать числа. Например, если задается bound = 3,
//        нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
//        Если вы запустите этот код, то на консоли вы должны получить числа: 0, 1, 4, 9.

public class Square {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
