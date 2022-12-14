/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

public class Order {

  private static String id;

  public Order(String id) {
    this.id = id;
  }

  /**
   * TODO:
   * get the items from the cart and iterate over them, print each item's product code
   * get cart total and print
   *
   * @return
   */
  public static void processCart(ShoppingCart<? extends Product> cart) {
    for (Product item : cart.allItems()) {
      System.out.println(item);


    }
    System.out.println(cart.total());
  }


  public String getId() {
    return id;
  }

}

