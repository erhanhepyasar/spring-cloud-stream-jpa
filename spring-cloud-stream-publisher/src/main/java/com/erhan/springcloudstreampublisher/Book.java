package com.erhan.springcloudstreampublisher;

import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book extends AbstractAggregateRoot<Book> {

    @Id
    @GeneratedValue
    private Long id;

    private int bookId;

    private String name;

    public Book() {}

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;

        //Add this domain event which needs to be fired when the new cargo is saved
        addDomainEvent(new
                BookCreatedEvent(
                new BookCreatedEventData(bookId + 100)));
    }

    /**
     * Method to register the event
     * @param event
     */
    public void addDomainEvent(Object event){
        registerEvent(event);
    }

}
