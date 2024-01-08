package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		A a = new A(); //A객체 생성
		
		A.B b = a.new B(); //B객체 생성

	}

}
