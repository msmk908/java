package ch09.sec04.exam01;

public class A {
	//생성자
	A(){
		class B{} //로컬 클래스 선언
		
		B b = new B(); //로컬 객체 생성
	}
	
	//메소드
	void method() {
		class B{} //로컬 클래스 선언
		
		B b = new B(); //로컬 객체 생성
	}
}
