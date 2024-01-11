package ch13.test.q1;

public class Car extends Vehicle{
	// 승용차의 배기량에 대한 객체 변수를 선언한다
    int begi;

	// 승용차의 모델명, 가격과 배기량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
    public Car(String model, int price, int begi) {
    	super(model, price);
    	this.begi = begi;
    }

	// 승용차의 배기량을 반환한다
    public int getBegi() {
		return begi;
	}

	// 승용차의 세금을 계산한다
    @Override
	void tax() {
		if(begi>=3000) {
			System.out.println("세금: "+getPrice()*5/100);
		}else if(begi<3000 && begi>=1500) {
			System.out.println("세금: "+getPrice()*3/100);
		}else if(begi<1500) {
			System.out.println("세금: "+getPrice()*1/100);
		}
	}
	// 승용차의 모델명, 가격과 배기량을 반환한다
    @Override
	public String toString() {
    	return super.toString() + ", 배기량: " + begi;
	}

	// 승용차의 배기량을 주어진 값으로 변경한다
    public void setBegi(int begi) {
		this.begi = begi;
	}

	
}