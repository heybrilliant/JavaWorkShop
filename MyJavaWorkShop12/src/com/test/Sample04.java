package com.test;
import java.util.*;

public class Sample04 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("이순신");
		ll.add(30);
		for(Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0,"세종대왕");
		ll.addFirst("을지문덕");
		ll.addLast("권율");
		Iterator  ltr = ll.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}

}
