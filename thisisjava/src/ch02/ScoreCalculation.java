package ch02;

import java.util.Scanner;

public class ScoreCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu; //점수
		int count = 0; //점수들의 수
		int max = -1; //최고 점수
		int min = 101; //최저 점수
		int sum = 0; //합계
		double aver; //평균 점수
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");//점수를 입력한다
		jumsu = scan.nextInt();
		while(jumsu!=-99) { // -99를 입력하면 종료
					if (max < jumsu) {
						max = jumsu;
					} // 최대값을 입력
					if (min > jumsu) {
						min = jumsu;
					} // 최소값을 입력
					sum += jumsu; //점수의 합
					count++; //점수 카운트
					System.out.print("점수를 입력하세요: ");
					jumsu = scan.nextInt(); //다시 점수 입력
			}
		
		aver = (double)sum/count; //평균점수 계산
		System.out.println("최고 점수 = "+max);
		System.out.println("최저 점수 = "+min);
		System.out.println("평균 점수 = "+aver);
	}

}
