package ch07.sec04.exam01;

public class Calculator {
	// 메서드 선언
	public double areaCircle(double r) {// 반환타입 double, 매개변수 r : 반지름
		System.out.println("Calculator 객체의 areaCircle()실행");
		return r*r*3.14159;
	}
}
