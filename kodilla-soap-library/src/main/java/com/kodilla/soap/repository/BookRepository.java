package com.kodilla.soap.repository;

import com.kodilla.library.soap.Book;
import com.kodilla.library.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

@Component
public class BookRepository {
    private static final Map<String, Book> library = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book potter = new Book();
        potter.setSignature("A112");
        potter.setTitle("Harry potter");
        potter.setAuthor("J.K. Rowling");
        potter.setYearOfProduce(1999);
        potter.setGenre(Genre.FANTASY);

        library.put(potter.getSignature(), potter);

        Book randomBook = new Book();
        potter.setSignature("A113");
        potter.setTitle("Random title");
        potter.setAuthor("Random Author 1");
        potter.setYearOfProduce(2012);
        potter.setGenre(Genre.SCI_FI);

        library.put(randomBook.getSignature(), potter);

        Book anotherRandomBook = new Book();
        potter.setSignature("A114");
        potter.setTitle("Random title 2");
        potter.setAuthor("Random Author 3");
        potter.setYearOfProduce(2000);
        potter.setGenre(Genre.CRIME);

        library.put(anotherRandomBook.getSignature(), potter);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify book signature");
        return library.get(signature);
    }
}