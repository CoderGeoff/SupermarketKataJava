package siemens.plm.supermarket_kata.tests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import siemens.plm.supermarket_kata.Basket;

public class BasketTests {

	@Test
	public void testBasket1() {
		Basket b = new Basket();
		assertEquals(0, b.count());
	}

	@Test
	public void testBasket2() {
		Basket b = new Basket();
		assertEquals(b.count(), 0);
		b.add("TinOfBeans");
		b.add("Coleslaw");
		b.add("TinOfBeans");
		assertEquals(b.count(), 3);
		Iterator<String> i = b.iterator();
		for (int ii = 0; ii < 3; ++ii)
		{
			String next = i.next();
			switch(ii)
			{
	        case 0:
	        case 2:
	            assertEquals(next, "TinOfBeans");
	            break;
	        case 1:
	            assertEquals(next, "Coleslaw");
			}
		}
	}
	
}
