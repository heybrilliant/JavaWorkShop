package com.test;

public class Sample10_1 {
	static class StaticClass{
		void testMethod2() {
			System.out.println("testMethod2 in StaticClass + b");
		}
	}
	static int b = 30;
	public static void main(String[] args) {
//		Sample10_1 obj = new Sample10_1();
//		Sample10_1.InnerClass obj2 = obj.new InnerClass();
//		
		Sample10_1.StaticClass obj3 = new Sample10_1.StaticClass();
		obj3.testMethod2();
	}
	private int a = 10;
	class InnerClass{
		void testMethod() {
			System.out.println("testMethod in innerClass");
		}
	}
}
