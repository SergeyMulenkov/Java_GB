package org.example.homework3.hw3;

import org.example.homework3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит
 * «А» и год издания после 2010 г, включительно.
 */

public class Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Python", "Аюпов", 900, 2020, 151);
        Book book2 = new Book("Java", "Бубов", 825, 2010, 276);
        Book book3 = new Book("С#", "Баранов", 750, 2015, 157);
        Book book4 = new Book("База данных", "Овечкин", 675, 2010, 199);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book b : books) {
            if (b.getSurName().contains("А") | b.getSurName().contains("а") && primeNumber(b.getNumberOfPages()) && b.getYearOfPublishing() >= 2010) {
                System.out.println("Название книги: " + b.getNameBook());
            }
        }
    }

    public static boolean primeNumber(int num) {
        Double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}