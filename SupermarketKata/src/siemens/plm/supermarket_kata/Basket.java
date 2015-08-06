package siemens.plm.supermarket_kata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Iterable<String> {

	private List<String> m_Items = new ArrayList<String>(); 
	
	public int count() {
		return m_Items.size();
	}

	public void add(String item) {
		m_Items.add(item);
	}

	public Iterator<String> iterator() {
		return m_Items.iterator();
	}

}
