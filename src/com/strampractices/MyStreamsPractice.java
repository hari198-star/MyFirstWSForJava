package com.strampractices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyStreamsPractice {

	public static void main(String[] args) {
		
		List<String> names = 
				Arrays.asList("hari", "bubby", "chuchu", "suma", "hari");
		
		Set<String> namesSet =
				names.stream().collect(Collectors.toSet());
		
		namesSet.forEach(System.out::println);
		
		Map<String, String> namesMap = 
				names.stream().collect(Collectors.toMap(String::toString, String::toString, (oldValue, newValue) -> oldValue));
		
		namesMap.keySet().stream().forEach(System.out::println);

	}

}
