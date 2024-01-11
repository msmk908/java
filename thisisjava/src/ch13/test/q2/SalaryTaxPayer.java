package ch13.test.q2;

public class SalaryTaxPayer extends TaxPayer{
	private int salary;		// 월급

	// 근로소득자의 이름, 번호와 월급을 주어진 값으로 초기화한다
	public SalaryTaxPayer(String name, int number, int salary){
        super(name, number);
        this.salary = salary;
	}
	// 근로소득자의 월급을 반환한다
	public int getSalary() {
		return salary;
	}
	// 근로소득자의 이름, 번호와 월급을 반환한다
	public String toString(){
		return super.toString()+", 월급: "+salary;
	}
	// 근로소득자의 월급을 주어진 값으로 변경한다
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// 근로소득자의 세금을 계산한다
	/*@Override
	public double tax(){
		double a = 0;
		if(salary*12<=20000000) {
			a = salary*12*5/100;
		}else if(salary*12>20000000 && salary*12<=40000000) {
			a = salary*12*10/100;
		}else if(salary*12>40000000 && salary*12<=60000000) {
			a = salary*12*15/100;
		}else if(salary*12>60000000 && salary*12<=80000000) {
			a = salary*12*20/100;
		}else if(salary*12>80000000) {
			a = salary*12*30/100;
		}
		
		return a;
		
	}*/
	@Override
	double tax() {
		// TODO Auto-generated method stub
		double a = 0;
		if(salary*12<=20000000) {
			a = salary*12*5/100;
		}else if(salary*12>20000000 && salary*12<=40000000) {
			a = salary*12*10/100;
		}else if(salary*12>40000000 && salary*12<=60000000) {
			a = salary*12*15/100;
		}else if(salary*12>60000000 && salary*12<=80000000) {
			a = salary*12*20/100;
		}else if(salary*12>80000000) {
			a = salary*12*30/100;
		}
		
		return a;
		
	}
	
	
	
}