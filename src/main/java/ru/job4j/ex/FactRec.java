package ru.job4j.ex;

public class FactRec {
    public static int calcRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
        return calcRec(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rsl = calcRec(3);
        System.out.println(rsl);
    }
}
