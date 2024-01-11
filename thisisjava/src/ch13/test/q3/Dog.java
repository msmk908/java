package ch13.test.q3;

public class Dog extends Pet {
	private String breed; // 품종
	private boolean boosterShot; // 예방주사 접종여부

	// 개의 이름, 나이와 품종을 각각 기본 값으로 초기화하고
	// 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
	public Dog() {
		boosterShot = false;
		breed = null;
	}

	// 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고
	// 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	// 개의 모든 데이터를 알려 준다
	public String toString() {
		return "이름: "+super.toString()+"\n나이: "+super.toInt();
	}

	// 개의 품종을 변경한다
	public void setBreed(String newBreed) {
		this.breed = newBreed;
	}

	// 개의 예방주사 접종여부를 변경한다
	public void setBoosterShot(boolean newboosterShot) {
		this.boosterShot = newboosterShot;
	}

	// 개의 품종을 알려 준다
	public String getBreed() {
		return "품종: "+breed;
	}

	// 개의 예방주사 접종여부를 알려 준다
	public String getBoosterShot() {
		if(boosterShot) {
			return "예방주사를 맞았다";
		}else {
			return "예방주사를 맞지 않았다.";
		}
	}
}
