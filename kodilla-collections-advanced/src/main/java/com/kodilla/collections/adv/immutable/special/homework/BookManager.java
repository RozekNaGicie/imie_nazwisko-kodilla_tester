package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private Set<Book> listOfBooks = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        listOfBooks.add(book);
        return book;
    }

    public Set<Book> getListOfBooks() {
        return listOfBooks;
    }
}
