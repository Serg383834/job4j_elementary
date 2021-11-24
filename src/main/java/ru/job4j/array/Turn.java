package ru.job4j.array;

//  Вам необходимо реализовать метод back, который принимает в себя массив целых
//  чисел, а возвращает тот же самый массив, но перевёрнутый задом наперёд.
//  Используйте цикл for для обращения к элементам массива
//  Используйте метод .length - он возвращает длину массива.
//  Подумайте, имеет ли смысл проходить до конца массива, если вам нужно поменять
//  начальные элементы с конечными

public class Turn {

    public static int[] back(int[] array) {

        int num = array.length - 1;
        for (int i = 0; i < (array.length) / 2; i++) {
            int tmp = array[i];
            array[i] = array[num];
            array[num] = tmp;
            num -= 1;
        }
        return array;
    }
}
