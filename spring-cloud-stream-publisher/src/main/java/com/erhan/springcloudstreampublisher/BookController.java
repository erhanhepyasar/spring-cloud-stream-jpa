package com.erhan.springcloudstreampublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {

        Book newBook = new Book(book.getBookId(), book.getName());

        final Book savedBook = bookRepository.save(newBook);
        return savedBook;
    }
}
