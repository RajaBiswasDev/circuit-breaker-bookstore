package com.circuitbreaker.recommeningapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class BookRecommendingApplication {
  private final Logger logger = LoggerFactory.getLogger(BookRecommendingApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(BookRecommendingApplication.class, args);
  }

  @RequestMapping(value = "/recommended")
  public Mono<String> readingList(){
    logger.info("Inside bookstore app fetching readingList...");
    return Mono.just("Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)");
  }
}
