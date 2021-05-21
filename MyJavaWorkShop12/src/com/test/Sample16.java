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
		MyData m1 = new MyData(new String("이순신"));
		String o1 = (String)m1.getA();
		String s = (String)o1;
		MyData<Integer> m2 = new MyData<Integer>(10);
		m2.getA(); // 캐스팅 안해줘도 int  타입 나옴 Integer i = m2.getA(); 을 간편하게 사용할 수 있음
		MyData<String> m3 = new MyData<String>("이순신"); // 지네릭 기능 -> 나중에 타입캐스팅 이슈가 없음
		m3.getA(); // 캐스팅 안해줘도 String 타입 나옴 String str = m3.getA(); 을 간편하게 사용할 수 있음
	}

}
