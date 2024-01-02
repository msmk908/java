package ch02;

import java.util.Scanner;

public class swtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		int totalCount = 0;
		int Account = 0; // A학점의 수 90점 이상
		int Bccount = 0; // B학점의 수 80점 이상 90점 미만
		int Cccount = 0; // C학점의 수 70점 이상 80점 미만
		int Dccount = 0; // D학점의 수 60점 이상 70점 미만
		int Fccount = 0; // F학점의 수 60점 미만

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");// 점수를 입력한다
		score = scan.nextInt();
		while (score != -1) {
			switch (score / 10) {
			case 10: ;
			case 9: Account++; break;
			case 8: Bccount++; break;
			case 7: Cccount++; break;
			case 6: Dccount++; break;
			default: Fccount++;
			}
			totalCount++;
			System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");// 점수를 입력한다
			score = scan.nextInt();
		}
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");// 점수를 입력한다 score =
		 * scan.nextInt();
		 * 
		 * while (score != -1) { if (score >= 90) { Account++; } if (score < 90 && score
		 * >= 80) { Bccount++; } if (score < 80 && score >= 70) { Cccount++; } if (score
		 * < 70 && score >= 60) { Dccount++; } if (60 > score) { Fccount++; }
		 * totalCount++; System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");// 점수를 입력한다 score
		 * = scan.nextInt(); }
		 */
		System.out.println("점수들의 총수 = " + totalCount);
		System.out.println("A 학점수 = " + Account);
		System.out.println("B 학점수 = " + Bccount);
		System.out.println("C 학점수 = " + Cccount);
		System.out.println("D 학점수 = " + Dccount);
		System.out.println("F 학점수 = " + Fccount);

	}

}
