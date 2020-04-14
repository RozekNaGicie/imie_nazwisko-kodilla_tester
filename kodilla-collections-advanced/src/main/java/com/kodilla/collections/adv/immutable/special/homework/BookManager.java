package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> listOfBooks = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        if (listOfBooks.contains(book)) {
            System.out.println("Ksiazka juz jest na liscie");
        } else {
            listOfBooks.add(book);
        }
        return book;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }
}
