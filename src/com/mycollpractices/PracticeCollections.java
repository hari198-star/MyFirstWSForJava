package com.mycollpractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PracticeCollections {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Hari Krishna");
		names.add("sumalatha");
		names.add("bubby");
		names.add("chuchu");
		
		System.out.println(names);
		
		Collection<String> namesCopy = new ArrayList();
		
		namesCopy.add("dummy");
		
		namesCopy.addAll(names);
		
		names.add("new");
		
		System.out.println(namesCopy);
		
		System.out.println(namesCopy.containsAll(names));
		
	}

}
