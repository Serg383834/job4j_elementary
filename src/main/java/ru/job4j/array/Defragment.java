package ru.job4j.array;

// Вам нужно добавить еще один цикл, который найдет не null ячейку - notNullIndex.
// После этого нужно поменять ячейки местами swap(array, nullIndex, notNullIndex);

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = point + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        array[point] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null,
                "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
