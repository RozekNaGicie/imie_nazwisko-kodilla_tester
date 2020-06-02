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
        randomBook.setSignature("A113");
        randomBook.setTitle("Random title");
        randomBook.setAuthor("Random Author 1");
        randomBook.setYearOfProduce(2012);
        randomBook.setGenre(Genre.SCI_FI);

        library.put(randomBook.getSignature(), randomBook);

        Book anotherRandomBook = new Book();
        anotherRandomBook.setSignature("A114");
        anotherRandomBook.setTitle("Random title 2");
        anotherRandomBook.setAuthor("Random Author 3");
        anotherRandomBook.setYearOfProduce(2000);
        anotherRandomBook.setGenre(Genre.CRIME);

        library.put(anotherRandomBook.getSignature(), anotherRandomBook);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify book signature");
        return library.get(signature);
    }
}