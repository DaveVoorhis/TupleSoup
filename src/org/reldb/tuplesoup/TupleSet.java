package org.reldb.tuplesoup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TupleSet implements Iterable<Tuple> {

	private Set<Tuple> tuples = new HashSet<>();
	
	public TupleSet add(Tuple tuple) {
		tuples.add(tuple);
		return this;
	}
	
	public Iterator<Tuple> iterator() {
		return tuples.iterator();
	}
}
