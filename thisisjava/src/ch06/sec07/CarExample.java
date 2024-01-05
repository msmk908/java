package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Car myCar1 = new Car();
		System.out.println("company: "+myCar1.company);
		System.out.println("model: "+myCar1.model);
		System.out.println("color: "+myCar1.color);
		System.out.println("maxSpeed: "+myCar1.maxSpeed);
		System.out.println();
		
		Car myCar2 = new Car("자가용");
		System.out.println("company: "+myCar2.company);
		System.out.println("model: "+myCar2.model);
		System.out.println("color: "+myCar2.color);
		System.out.println("maxSpeed: "+myCar2.maxSpeed);
		System.out.println();
		
		Car myCar3 = new Car("자가용", "빨강");
		System.out.println("company: "+myCar3.company);
		System.out.println("model: "+myCar3.model);
		System.out.println("color: "+myCar3.color);
		System.out.println("maxSpeed: "+myCar3.maxSpeed);
		System.out.println();
		
		Car myCar4 = new Car("자가용", "빨강", 200);
		System.out.println("company: "+myCar4.company);
		System.out.println("model: "+myCar4.model);
		System.out.println("color: "+myCar4.color);
		System.out.println("maxSpeed: "+myCar4.maxSpeed);
		System.out.println();
	}

}
