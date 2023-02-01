package ru.job4j.array;
// Внутри метода main создайте три переменных.
//         - Массив на 10 элементов типа short с именем ages.
//         - Массив на 100500 элементов типа String c именем surnames.
//         - Массив на 40 элементов типа float с именем prices.
// В методе main к каждому созданному массиву добавьте вывод в консоль размера объявленного массива.
// Создайте внутри метода main массив String на 4 ячейки. Дайте имя переменной созданного массива - names.
//Заполните массив произвольными именами. Заполнение производить через обращение по индексу.
//После этого выведите каждую ячейку на консоль.
public class ArrayDefinition {
    public static void main(String[] args) {

    short[] ages = new short[10];
    String[] surnames = new String[100500];
    float[] prices = new float[40];
    String[] names = new String[4];
    names[0] = "name1";
    names[1] = "name2";
    names[2] = "name3";
    names[3] = "name4";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        for (String string: names) {
            System.out.println(string);

        }
    }
}
