package ru.job4j.loop;
// написать public static int year(double amount, double salary, double percent)
// где amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
// Метод должен вычислять количество лет, необходимых для погашения кредита.
//        Пример:
// Вы взяли кредит на 100 рублей под кредитную ставку 50% в год. Каждый год вы зарабатываете 120 рублей.
// К концу года нужно заплатить 150 рублей. За первый год вы выплатите 120 рублей.
// На второй год останется заплатить 30 рублей. Итого: 2 года на погашение кредита.
//   Объяснение:
// Вы должны использовать цикл while: в теле цикла произвести вычисление кредитной суммы за год
// плюс остатка.

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
        amount += amount * percent / 100 - salary;
        year++;
        }
        return year;
    }
}
