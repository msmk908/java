package ch02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		year = scan.nextInt();
		
		if(year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}else if(year%100==0) {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}else if(year%4==0) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}

}
