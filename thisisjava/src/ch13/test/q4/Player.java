package ch13.test.q4;

public class Player {
	//필드
	private String name;
	private int total;
	
	// 생성자
	Player(String name){
		setName(name);
	}

	//메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public void roll(PairOfDice dice) {
		int value1, value2;
		
		dice.roll();
		
		value1 = dice.getFaceValue1();
		value2 = dice.getFaceValue2();
		total = value1 + value2;
		System.out.println("\t 주사위 1: "+value1+" 주사위 2: "+value2+" 점수: "+total);
	}
	
	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}
	
	
	
	

}
