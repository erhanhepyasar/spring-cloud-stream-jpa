package com.erhan.springcloudstreamconsumer;

public class BookCreatedEventData {

    private int bookId;

    public BookCreatedEventData(){}

    public BookCreatedEventData(int bookId){
        this.bookId = bookId;
    }

    public void setBookingId(int bookId){
        this.bookId = bookId;
    }
    public int getBookId(){
        return this.bookId;
    }
}
