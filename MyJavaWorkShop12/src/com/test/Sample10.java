package com.test;

import java.util.*;

public class Sample10 extends MyVector implements Iterator{
	int cursor = 0;
	int lastRet = -1;
	
	public Sample10(int capacity) {
		super(capacity);
	}
	public Sample10() {
		this(10);
	}
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i = 0; it.hasNext(); i++) {
			if(i!=0) tmp+=",";
			tmp+= it.next();
		}
		return "["+ tmp +"]";
	}
public Iterator iterator() {
	cursor = 0;
	lastRet = -1;
	return this;
	}
public boolean hasNext() {
	return cursor != size();
}
public Object next() {
	Object next = get(cursor);
	lastRet = cursor++;
	return next;
}
public void remove() {
	if(lastRet==-1) {
		throw new IllegalStateException();
	} else {
		remove(lastRet);
		cursor--;
		lastRet = -1;
	}
}
}
