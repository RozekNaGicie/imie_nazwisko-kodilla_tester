package com.kodilla.collections.adv.immutable.special.homework;

public class BookApp {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book firstBook = bookManager.createBook("Java: Podstawy", "Cay S. Horstman");
        Book secondBook = bookManager.createBook("Harry Potter", "J.K. Rowling");
        Book thirdBook = bookManager.createBook("Java: Podstawy", "Cay S. Horstman");
        Book fourthBook = bookManager.createBook("Java: Podstawy", "Cay S. Horstman");

        System.out.println(bookManager.getListOfBooks());
//        System.out.println(firstBook);
//        System.out.println(thirdBook);
//        System.out.println(firstBook == thirdBook);
    }
}
