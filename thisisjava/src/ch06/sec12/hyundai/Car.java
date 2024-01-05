package ch06.sec12.hyundai;

//import를 통해 다른 패키지의 클래스를 이용할 수 있다.
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	
	//명시적 기업을 통해서 다른 패키지의 클래스를 이용할 수 있다.
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	
	//import된 클래스는 클래스명으로 객체 생성 가능
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
