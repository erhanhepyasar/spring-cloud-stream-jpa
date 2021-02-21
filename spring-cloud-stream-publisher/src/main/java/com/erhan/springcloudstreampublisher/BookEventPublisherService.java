package com.erhan.springcloudstreampublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.messaging.support.MessageBuilder;

@Service
@EnableBinding(BookEventSource.class)
public class BookEventPublisherService {

    @Autowired
    BookEventSource bookEventSource;

    @TransactionalEventListener
    public void handleBookCreatedEvent(BookCreatedEvent bookCreatedEvent){
        bookEventSource.bookCreating().send(MessageBuilder.withPayload(bookCreatedEvent).build());
    }

}
