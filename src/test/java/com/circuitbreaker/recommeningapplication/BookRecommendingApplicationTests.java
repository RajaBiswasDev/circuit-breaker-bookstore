package com.circuitbreaker.recommeningapplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookRecommendingApplicationTests {

  @InjectMocks
  BookRecommendingApplication bookRecommendingApplication;

  @Test
  void testReadingListRespondsWithSomeBooks() {
    assertNotNull(bookRecommendingApplication.readingList());
  }
}
