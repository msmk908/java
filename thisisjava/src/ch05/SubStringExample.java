package ch05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		System.out.println(year+"년"+month+"월"+day+"일");
	}

}
