package com.example.demoactivemq.controller;

import com.example.demoactivemq.model.Message;
import com.example.demoactivemq.producer.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/producers")
public class ProducerController {
  private final ProducerService producerService;

  @PostMapping("/send")
  public ResponseEntity<String> send(@RequestBody Message message){
    producerService.sendMessage(message);
    return ResponseEntity.ok("OK");
  }
}
