package ch13.test.q1;

public class Truck extends Vehicle{
	// 트럭의 적재 중량에 대한 객체 변수를 선언한다
    double zucze;

	// 트럭의 모델명, 가격과 적재 중량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
    public Truck(String model, int price, double zucze) {
    	super(model, price);
    	this.zucze = zucze;
    }

	// 트럭의 적재 중량을 반환한다
	public double getZucze() {
		return zucze;
	}

	// 트럭의 세금을 계산한다
	@Override
	void tax() {
		if(zucze>=10000) {
			System.out.println("세금: "+getPrice()*4/100);
		}else if(zucze<10000 && zucze>=5000) {
			System.out.println("세금: "+getPrice()*2/100);
		}else if(zucze<5000) {
			System.out.println("세금: "+getPrice()*1/100);
		}
		
	}
	// 트럭의 모델명, 가격과 적재 중량을 반환한다
	@Override
	public String toString() {
    	return super.toString() + ", 적재 중량: " + zucze;
	}

	// 트럭의 적재 중량을 주어진 값으로 변경한다
	public void setZucze(double zucze) {
		this.zucze = zucze;
	}
}
