package ch02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean multiple = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		num = scan.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if(num%5==0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}
		if(num%8==0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}
		if(multiple == false) {
			System.out.println("아무 배수도 아니다");
		}
	}

}
