package com.example.demoactivemq.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
  private String description;

}
