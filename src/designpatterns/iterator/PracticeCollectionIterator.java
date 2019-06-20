package designpatterns.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PracticeCollectionIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("anirudh");
		list.add("devarsh");
		list.add("sumalatha");
		list.add("hari");
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(itr.previous());
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.keySet().iterator();
	}

}
