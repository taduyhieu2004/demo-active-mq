package com.example.demoactivemq.consumer;

import com.example.demoactivemq.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;

@Slf4j
public class MessageConsumer {

  @JmsListener(destination = "my-queue")
  public void listenMessage(Message message){
    log.info("listenMessage" + message);
  }
}
