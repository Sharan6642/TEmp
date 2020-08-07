package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderPriceUitlTest {

	
	OrderPriceUitl orderPriceUitl = new OrderPriceUitl() ;

	@Test
	void contextLoads() {

		assertTrue(!orderPriceUitl.getMenuItems().isEmpty(), "Menu loaded loaded");
		assertTrue(!orderPriceUitl.getMenuPrice().isEmpty(), "Menu price loaded");

	}

	@Test
	public void checkMiniumOrder() {

		String[] orders = {};
		assertTrue(OrderPriceUitl.orderPrice(orders) == 0.0, "At least one order to be placed");
		

	}

	@Test
	public void orderValid() {

		String[] orders = { "Chai, -sugar", "Chai", "Coffee, -milk" };

		assertTrue(OrderPriceUitl.orderPrice(orders) == 11.5, "Price computed correctly");
	}

	@Test
	public void OrderNotIncludeExlusion() {

		String[] orders = { "Chai, -Tea, -milk, -sugar, -water" };

		assertTrue(OrderPriceUitl.orderPrice(orders) == 2.0, "Order not conatin all exlusion items");

	}

}