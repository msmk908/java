package ch13.test.q8;

public class Student {
	public int number; // 학번
	public String name; // 이름

	// -------------------------------------------------------
	// 변수들을 주어진 값들로 초기화하면서 새 Student 객체를 생성한다.
	// -------------------------------------------------------
	public Student(int Number, String Name) {
		this.number = Number;
		this.name = Name;
	}

	// -------------------------------------------------------
	// 현 Student 객체의 모든 데이터를 문자열로 반환한다.
	// -------------------------------------------------------
	public String toString() {
		String str = number + "의 이름: " + name; 
		return str;
	}
}
