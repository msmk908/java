package ch13.test.q1;

public class VehicleDriver
{
	public static void main(String[] args)
	{
		// 3,500 cc의 가격이 5,000 만원인 제네시스 승용차를 나타내는 Car 객체를 생성한다
        Car car1 = new Car("genesis", 50000000, 3500);

		// car1이 가리키는 객체의 모든 데이터를 출력한다
        System.out.println(car1.toString());

		// car1이 가리키는 객체의 세금을 계산하여 출력한다
        car1.tax();

		// 2,500 톤의 가격이 2,000 만원인 봉고 트럭을 나타내는 Truck 객체를 생성한다
        Truck truck1 = new Truck("bonggo", 20000000, 2500.0);

		// truck이 가리키는 객체의 모든 데이터를 출력한다
        System.out.println(truck1.toString());

		// truck이 가리키는 객체의 세금을 계산하여 출력한다
        truck1.tax();

		// 1,000 cc의 가격이 1,500 만원인 쏘울 승용차를 나타내는 Car 객체를 생성한다
        Car car2 = new Car("ssoul", 15000000, 1000);

		// car2가 가리키는 객체의 모든 데이터를 출력한다
        System.out.println(car2.toString());

		// car2가 가리키는 객체의 세금을 계산하여 출력한다
        car2.tax();
	}
}
