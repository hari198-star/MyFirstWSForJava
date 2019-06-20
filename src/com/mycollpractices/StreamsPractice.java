package com.mycollpractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {
		StreamsPractice sp = new StreamsPractice();
		sp.getSampleShapes().stream().
			 filter(e -> e.getColor().equals("RED")).
		     forEach(e -> System.out.println(e.getColor() + "  " + e.getName()));
		
		String total = sp.getSampleShapes().stream().
				map(Object::toString)
				.collect(Collectors.joining(", "));
		
		System.out.println(total);
	}
	
	private Collection<Shape> getSampleShapes() {
		Collection<Shape> coll = new ArrayList<Shape>();
		coll.add(new Shape("RED", "REDCircle"));
		coll.add(new Shape("RED", "REDTriangle"));
		coll.add(new Shape("RED", "REDPolygon"));
		coll.add(new Shape("BLUE", "REDRadius"));
		coll.add(new Shape("Orange", "OrangeSquare"));
		coll.add(new Shape("Violet", "VioletLine"));
		coll.add(new Shape("GREEN", "GreenHexagon"));
		coll.add(new Shape("RED", "REDHexagon"));
		return coll;
	}

}
