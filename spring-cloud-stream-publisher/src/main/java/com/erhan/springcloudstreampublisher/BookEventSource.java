package com.erhan.springcloudstreampublisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BookEventSource {

    @Output("bookCreatingChannel")
    MessageChannel bookCreating();
}
