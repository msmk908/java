package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// -128~127 초과값일 경우
		Integer obj1 = 300; // 따로 객체 생성
		Integer obj2 = 300; // 따로 객체 생성
		System.out.println("==: "+(obj1 == obj2));
		System.out.println("equals(): "+obj1.equals(obj2));
		System.out.println();
		
		// -128~127 범위값일 경우
		Integer obj3 = 10; // 객체 생성
		Integer obj4 = 10; // 범위값이라 10 객체 참조
		System.out.println("==: "+(obj3 == obj4));
		System.out.println("equals: "+obj3.equals(obj4));
	}

}
