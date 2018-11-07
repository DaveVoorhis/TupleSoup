package org.reldb.tuplesoup;

public class Attribute {
	private String identifier;
	private Object value;
	public Attribute(String identifier, Object value) {
		this.identifier = identifier;
		this.value = value;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public Object getValue() {
		return value;
	}
}
