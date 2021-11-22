package ru.job4j.array;
// Внутри метода main создайте три переменных.
//         - Массив на 10 элементов типа short с именем ages.
//         - Массив на 100500 элементов типа String c именем surnames.
//         - Массив на 40 элементов типа float с именем prices.
// В методе main к каждому созданному массиву добавьте вывод в консоль размера объявленного массива.
public class ArrayDefinition {
    public static void main(String[] args) {

    short[] ages = new short[10];
    String[] surnames = new String[100500];
    float[] prices = new float[40];

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
