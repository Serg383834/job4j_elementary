package ru.job4j.loop;

//Описание:
//        В этом задании нужно проверить, что число является простым.
//        Простым считается число, которое делится только на себя и на единицу.//
//    Требования к задаче:
// 1. Необходимо создать класс ru.job4j.loop.CheckPrimeNumber;
// 2. В классе ru.job4j.loop.CheckPrimeNumber написать метод
// 3. Метод должен вернуть true, если переменная number является простым числом.

public class CheckPrimeNumber {

    public static boolean check(int number) {

        boolean prime = number > 1;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}




