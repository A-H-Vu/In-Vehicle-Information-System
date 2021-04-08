package main;

import java.util.ArrayList;
import java.util.Random;

public abstract class HashMap<K,V> extends AbstractMap<K,V> {
	protected int n=0;
	protected int capacity;
	private int prime;
	private long scale, shift;
	
	public HashMap(int cap,int p) {
		prime=p;
		capacity=cap;
		Random rand= new Random();
		scale = rand.nextInt(prime-1)+1;
		shift=rand.nextInt(prime);
		createTable();
	}
	public HashMap(int cap) {this(cap,109345121);}
	public HashMap() {this(17);}
	
	public int size() {return n;}
	public V get(K key) {return bucketGet(hashValue(key),key);}
	public V remove(K key) {return bucketRemove(hashValue(key),key);}
	public V put(K key,V value) {
		V answer = bucketPut(hashValue(key),key,value);
		if(n>capacity/2) {resize(2*capacity-1);}
		return answer;
	}
	
	private int hashValue(K key) {
		return (int)((Math.abs(key.hashCode()*scale+shift)%prime)%capacity);
	}
	private void resize(int newCap) {
		ArrayList<Entry<K,V>>buffer=new ArrayList<>(n);
		for(Entry<K,V> e:entrySet()) {
			buffer.add(e);
		}
		capacity=newCap;
		createTable();
		n=0;
		for(Entry<K,V>e:buffer) {
			put(e.getKey(),e.getValue());
		}
	}
	
	protected abstract void createTable();
	protected abstract V bucketGet(int h,K k);
	protected abstract V bucketPut(int h,K k,V v);
	protected abstract V bucketRemove(int h,K k);
}