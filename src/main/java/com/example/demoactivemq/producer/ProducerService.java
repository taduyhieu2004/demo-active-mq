package com.example.demoactivemq.producer;

import com.example.demoactivemq.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProducerService {
  private final JmsTemplate jmsTemplate;

  public void sendMessage(Message message){
    jmsTemplate.convertAndSend(message);
  }



}
