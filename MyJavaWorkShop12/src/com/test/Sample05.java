package com.test;

import java.util.*;

public class Sample05 {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(3);
		Iterator ltr = s.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		

	}

}
