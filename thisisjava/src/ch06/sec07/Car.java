package ch06.sec07;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		this("그랜저", "하양", 200);
	};
	
	Car(String model){
		this(model, "검정", 200);
	};
	
	Car(String model, String color){
		this(model, color, 200);
	};
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	};
}
