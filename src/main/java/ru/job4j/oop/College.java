package ru.job4j.oop;

public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman(); // создаем объекта класса Freshman.
        Student student = freshman; // делаем приведение к типу родителя Student.
        Object obj = student; // делаем приведение к типу родителя Object.

    }
}
