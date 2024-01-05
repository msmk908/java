package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// main에서 car 클래스 사용

		// Car 객체 생성
		Car myCar = new Car();
		
		System.out.println("제작회사: "+myCar.company); // String 초기값 null
		System.out.println("모델명: "+myCar.model); // String 초기값 null
		System.out.println("색깔: "+myCar.color); // boolean 초기값 false
		System.out.println("최고속도: "+myCar.maxSpeed); // boolean 초기값 false
		System.out.println("현재속도: "+myCar.speed); // int 초기값 0
		
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		
	}

}
