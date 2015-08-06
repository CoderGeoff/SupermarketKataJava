package siemens.plm.supermarket_kata;

import java.util.HashMap;

public class PriceList {
	@SuppressWarnings("serial")
	private HashMap <String, Integer> m_Prices = new HashMap <String, Integer>()
			{{ 
				put("TinOfBeans", 40);
				put("TinOfSoup", 90);				
				put("TinOfPeaches", 55);			
				put("Coleslaw", 50);				
			}};

	public int lookUp(String item) {
		return m_Prices.getOrDefault(item, 0);
	}
}
