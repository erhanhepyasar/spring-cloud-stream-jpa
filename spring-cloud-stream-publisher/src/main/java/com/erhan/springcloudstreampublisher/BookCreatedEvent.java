package com.erhan.springcloudstreampublisher;

public class BookCreatedEvent {

    BookCreatedEventData bookCreatedEventData;
    public BookCreatedEvent(){}


    public BookCreatedEvent(BookCreatedEventData bookCreatedEventData){
        this.bookCreatedEventData = bookCreatedEventData;
    }

    public void setBookCreatedEventData(BookCreatedEventData bookCreatedEventData){
        this.bookCreatedEventData = bookCreatedEventData;
    }
    public BookCreatedEventData getBookCreatedEventData(){
        return bookCreatedEventData;
    }
}
