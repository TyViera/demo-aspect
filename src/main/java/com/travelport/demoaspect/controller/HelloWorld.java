package com.travelport.demoaspect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
  @GetMapping
  public String sayHello(@RequestParam String name) {
    return "Hello " + name + ". You are welcome to our page";
  }

}
