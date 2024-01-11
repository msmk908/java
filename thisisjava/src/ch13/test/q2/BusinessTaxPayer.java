package ch13.test.q2;

public class BusinessTaxPayer extends TaxPayer
{
	private int sales;		// 총매출액
	private int expenses; 	// 총비용

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 주어진 값으로 초기화한다
	public BusinessTaxPayer(String name, int number, int sales, int expenses){
        super(name, number);
        this.sales = sales;
        this.expenses = expenses;
	}

	// 사업소득자의 총매출액을 반환한다
	public int getSales(){
        return sales;
	}

	// 사업소득자의 총비용을 반환한다
	public int getExpenses() {
		return expenses;
	}

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 반환한다
	public String toString(){
		return super.toString()+", 총매출액: "+sales+", 총비용: "+expenses;
	}
	// 사업소득자의 총매출액을 주어진 값으로 변경한다
	private void setSales(int sales){
        this.sales = sales;
	}
	// 사업소득자의 총비용을 주어진 값으로 변경한다
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	@Override
	double tax() {
		// TODO Auto-generated method stub
		double b = 0;
		double suip = sales - expenses;
		if(suip <= 0) {
    		b=0;
    	}else if(suip > 0 && suip <= 4000) {
    		b=suip*10/100;
    	}else if(suip > 4000) {
    		b=suip*20/100;
    	}
		return b;
	}

	// 사업소득자의 세금을 계산한다
	/*
    public double tax() {
    	double suip = sales - expenses;
    	if(suip <= 0) {
    		System.out.println(name+"의 세금 = 0");
    	}else if(suip > 0 && suip <= 4000) {
    		System.out.println(name+"의 세금 = "+suip*10/100);
    	}else if(suip > 4000) {
    		System.out.println(name+"의 세금 = "+suip*20/100);
    	}
    }*/
	
	
}