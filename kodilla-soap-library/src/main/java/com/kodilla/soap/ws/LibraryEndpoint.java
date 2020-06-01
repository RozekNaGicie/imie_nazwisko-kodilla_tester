package com.kodilla.soap.ws;

import com.kodilla.library.soap.GetBookRequest;
import com.kodilla.library.soap.GetBookResponse;
import com.kodilla.soap.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/library/soap";

    private BookRepository BookRepository;

    @Autowired
    public LibraryEndpoint(BookRepository coursesRepository) {
        this.BookRepository = coursesRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseRequest")
    @ResponsePayload
    public GetBookResponse getCourse(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(BookRepository.findBook(request.getName()));

        return response;
    }
}

