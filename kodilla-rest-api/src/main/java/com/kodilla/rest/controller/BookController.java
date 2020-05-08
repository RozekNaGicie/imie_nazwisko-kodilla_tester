package com.kodilla.rest.controller;


import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

///**
// * RestController - obsługa napływających żądań http req oraz generowanie odpowiedzi http resp;
// * RequestMapping - jaki jest obslugiwany adres zapytania przez ten kontroler;
// * GetMapping - oznacza ze ta metoda jest odpowiedzialna za obsluge żadań http req zmetody GET
// * Wewnątrz klasy kontrolera umieszczane są metody odpowiadające za obsługę poszczególnych rodzajów żądań http req;
// */

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void  addBook(@RequestBody BookDto book) {
        bookService.addBook(book);
    }
    @DeleteMapping
    public void removeBook(@RequestBody BookDto book) {
        bookService.removeBook(book);
    }
}
