package main;

public interface Iterator<K> {
	boolean hasNext();
	K next();
	void remove();	
}
