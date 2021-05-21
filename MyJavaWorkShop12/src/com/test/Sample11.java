package com.test;

abstract class Student{
	abstract void studying();
}

public class Sample11 {
	public static void main(String[] args) {
		Object o = new Object() {
			void testMethod() {
				System.out.println("testMethod");
			}
		};
		Student stu = new Student() {
			void studying() {
				System.out.println("Student studying");
			}
		};
		stu.studying();
	}
}
