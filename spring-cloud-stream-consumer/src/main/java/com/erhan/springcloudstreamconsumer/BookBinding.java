package com.erhan.springcloudstreamconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BookBinding {

    @Input("bookCreatingChannel")
    SubscribableChannel bookCreating();
}
