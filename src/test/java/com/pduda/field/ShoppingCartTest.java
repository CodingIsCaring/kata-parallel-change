package com.pduda.field;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void should_count_number_of_products_in_the_cart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);
        shoppingCart.add(10);

        assertEquals(2, shoppingCart.numberOfProducts());
    }

    @Test
    public void should_calculate_total_price_of_cart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        shoppingCart.add(10);

        assertEquals(20, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void should_have_discount_if_contains_at_least_one_product_worth_at_least_100() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);
        shoppingCart.add(10);

        assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void should_not_have_discount_if_contains_no_products_worth_at_least_100() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);
        shoppingCart.add(10);

        assertFalse(shoppingCart.hasDiscount());
    }

}
