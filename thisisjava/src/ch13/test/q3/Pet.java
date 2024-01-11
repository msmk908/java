package ch13.test.q3;

public class Pet {
	private String name; // 이름
	private int age; // 나이

	// 애완동물의 이름과 나이를 각각 기본 값으로 초기화하면서
	// Pet 객체를 생성한다
	public Pet() {
		name = null;
		age = 0;
	}
	// 애완동물의 이름과 나이를 각각 주어진 값으로 초기화하면서
	// Pet 객체를 생성한다
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// 애완동물의 이름을 변경한다
	public void setName(String newName) {
		this.name = newName;
	}
	// 애완동물의 나이를 변경한다
	public void setAge(int newAge) {
		this.age = newAge;
	}
	// 애완동물의 나이를 알려 준다
	public int toInt() {
		return age;
	}
	// 애완동물의 이름과 나이를 알려 준다
	public String toString() {
		return name;
	}
}
