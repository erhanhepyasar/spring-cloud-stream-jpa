package com.erhan.springcloudstreamconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;


/**
 * Event Handler for the OrderCreatedEvent that the Logistic Bounded Context is interested in
 */
@Service
@EnableBinding(BookBinding.class)
public class BookCreatedEventHandler {

    private Logger logger = LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);


    @StreamListener(target = "bookCreatingChannel")
    public void receiveEvent(BookCreatedEvent bookCreatedEvent) {
        //Process the Event
        logger.info("event received: " + bookCreatedEvent.getBookCreatedEventData().getBookId());
    }
}
