package com.bootcamp.demo;

import java.util.LinkedList;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
  private Order order; // ! testing Environment

  @BeforeEach()
  void BeforeEach() {
    this.order = new Order();
  }

  //! Test 1
  @Test
  void testCreateOrder() {
    assertEquals(0, this.order.getItems().size());
    assertTrue(this.order.getItems() instanceof LinkedList);

  }

//! Test 2
  @Test
  void testAdd() {
    assertEquals(0, this.order.getItems().size());
    this.order.add(new Order.Item(3.5, 5));
    assertEquals(1, this.order.getItems().size());
  }

//! Test 3
  @Test
  void testAdd2() {
    assertEquals(0, this.order.getItems().size());

    this.order.add(new Order.Item(apple));
    assertThat(this.order.getItems(), hasItem(apple));//<-MatcherAssert "hasitem"
  }
}
