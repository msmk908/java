package ch02;

import java.util.*;

public class numberQ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNumber;
		int guessNumber = 0;
		int count = 0;
		int sentinel = -99;
		String again = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("게임을 시작하시겠습니까?(yes/no)");
		again = scan.next();

		while (again.equals("yes")) {
			targetNumber = (int) (Math.random() * 100 + 1);
			while (guessNumber != sentinel) {
				System.out.print("숫자를 입력하세요: ");
				guessNumber = scan.nextInt();
				if (guessNumber > targetNumber) {
					System.out.println("추측한 숫자가 작다");
					count++;
				}
				if (guessNumber < targetNumber) {
					System.out.println("추측한 숫자가 크다");
					count++;
				}
				if (guessNumber == targetNumber) {
					System.out.println("추측한 숫자가 맞다");
					count++;
					System.out.println("추측한 횟수: " + count);
					break;
				}
			}
			System.out.print("계속하길 원하시나요?(yes/no): ");
			again = scan.next();
		}
	}
}
