package ch09.sec02.exam01;

public class A {
	
	class B{} //인스턴스 맴버 클래스
	
	B field = new B(); //인스턴스 필드 값으로 B 객체 대입
	
	//생성자
	A(){
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}

}
