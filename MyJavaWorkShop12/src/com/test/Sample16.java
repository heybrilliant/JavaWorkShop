package com.test;

class MyData<T> {
	private T a;
	MyData(T a){
		this.a = a;
	}
	public T getA() {
		return this.a;
	}
}

public class Sample16 {
	public static void main(String[] args) {
		MyData m = new MyData(11);
		Object o = m.getA()	;
		int a = (int)o;
		MyData m1 = new MyData(new String("�̼���"));
		String o1 = (String)m1.getA();
		String s = (String)o1;
		MyData<Integer> m2 = new MyData<Integer>(10);
		m2.getA(); // ĳ���� �����൵ int  Ÿ�� ���� Integer i = m2.getA(); �� �����ϰ� ����� �� ����
		MyData<String> m3 = new MyData<String>("�̼���"); // ���׸� ��� -> ���߿� Ÿ��ĳ���� �̽��� ����
		m3.getA(); // ĳ���� �����൵ String Ÿ�� ���� String str = m3.getA(); �� �����ϰ� ����� �� ����
	}

}
