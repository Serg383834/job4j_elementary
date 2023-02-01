package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Три мушкетера", 500);
        Book book2 = new Book("Война и мир", 1500);
        Book book3 = new Book("Приключения Шерлока Холмса", 2000);
        Book book4 = new Book("Властелин колец", 2500);
        Book book5 = new Book("Clean code", 0);
        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getPagesCount());
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getPagesCount());
        }

        for (Book book : books) {
            if ((book.getTitle()).equals("Clean code")) {
                System.out.println(book.getTitle() + " " + book.getPagesCount());
            }
        }
    }
}
