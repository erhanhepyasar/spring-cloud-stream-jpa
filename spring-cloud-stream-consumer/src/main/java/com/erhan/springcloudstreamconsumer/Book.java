package com.erhan.springcloudstreamconsumer;

import lombok.Data;

@Data
public class Book {

    private int bookId;

    private String name;

    public Book() {}

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }


}
