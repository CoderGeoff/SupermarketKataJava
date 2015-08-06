package siemens.plm.supermarket_kata.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import siemens.plm.supermarket_kata.Basket;
public class BasketTests {

	@Test
	public void givenAnEmptyBasket_CountShouldBeZero() {
		Basket b = new Basket();
		assertEquals(0, b.count());
	}

	@Test
	public void givenThreeItemsAreAddedToBasket_WhenCounted_BasketShouldContainThreeItems() {
		Basket basket = new Basket();
		basket.add("TinOfBeans");
		basket.add("Coleslaw");
		basket.add("TinOfBeans");
		assertEquals(basket.count(), 3);
	}
	
	@Test
	public void givenThreeItemsAreAddedToBasket_WhenExamined_BasketShouldContainTheAddedItems() {
		// Given
		Basket basket = new Basket();
		basket.add("TinOfBeans");
		basket.add("Coleslaw");
		basket.add("TinOfBeans");
		
		// When
		StringBuilder basketContentsStringBuilder = new StringBuilder();
		for (String item: basket)
		{
			basketContentsStringBuilder.append(basketContentsStringBuilder.length() == 0 ? "" : ", ");
			basketContentsStringBuilder.append(item);
		}
		String basketContents = basketContentsStringBuilder.toString();
		
		// Then
		String expectedContents = "TinOfBeans, Coleslaw, TinOfBeans";
		assertEquals(expectedContents, basketContents);
	}
	
}
