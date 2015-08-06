package siemens.plm.supermarket_kata.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import siemens.plm.supermarket_kata.PriceList;

public class PriceListTests {

	@Test
	public void priceOfTinOfBeansIs40p() {
		// Given
		PriceList priceList = new PriceList();
		
		// When
		int price = priceList.lookUp("TinOfBeans");
		
		// Then
		assertEquals(40, price);
	}


	@Test
	public void priceOfTinOfSoupIs90p() {
		// Given
		PriceList priceList = new PriceList();
		
		// When
		int price = priceList.lookUp("TinOfSoup");
		
		// Then
		assertEquals(90, price);
	}


	@Test
	public void priceOfTinOfPeachesIs55p() {
		// Given
		PriceList priceList = new PriceList();
		
		// When
		int price = priceList.lookUp("TinOfPeaches");
		
		// Then
		assertEquals(55, price);
	}

	@Test
	public void priceOfColeslawIs50p() {
		// Given
		PriceList priceList = new PriceList();
		
		// When
		int price = priceList.lookUp("Coleslaw");
		
		// Then
		assertEquals(50, price);
	}
}
