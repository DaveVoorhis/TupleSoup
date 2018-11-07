package org.reldb.tuplesoup;

import java.util.LinkedList;
import java.util.List;

public class Tuple {
	private List<Attribute> attributes = new LinkedList<>();
	
	public Tuple add(Attribute attribute) {
		attributes.add(attribute);
		return this;
	}
	
	public Tuple add(String identifier, Object value) {
		return add(new Attribute(identifier, value));
	}
}
