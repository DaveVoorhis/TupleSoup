package org.reldb.tuplesoup;

public class Soup {

	public Soup add(Tuple tuple) {
		
		return this;
	}
	
	public Soup add(TupleSet tupleSet) {
		for (Tuple tuple: tupleSet)
			add(tuple);
		return this;
	}
	
}
