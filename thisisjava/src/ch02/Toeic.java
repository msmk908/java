package ch02;

import java.util.Scanner;

public class Toeic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습 4.1: DetermineAppType.java
		// 입사 지원자의 평점과 TOEIC 점수에 따라 적절한 메시지를 출력한다
		      double grade;   // 평점

		      // 토익 점수를 저장하는 변수를 선언한다
		      int toeic; // 여기에 코드를 삽입하세요

		      // Scanner 객체를 생성하고 scan이 가리키게 한다
		       Scanner scan = new Scanner(System.in);

		      // 평점을 입력 받는다
		       System.out.print("평점을 입력하세요: ");
		       grade = scan.nextDouble();

		      // 토익 점수를 입력 받는다
		       System.out.print("TOEIC 점수를 입력하세요: "); // 여기에 코드를 삽입하세요
		       toeic = scan.nextInt();
		      // 평점과 토익 점수에 따라 지원시 적절한 메시지를 출력한다
		      if(toeic >= 700) {
		    	  if(grade >= 4.0) {
		    		  System.out.println("면접 대상자입니다.");
		    	  }else if(grade >= 3.5) {
		    		  System.out.println("서류 전형 대상자입니다.");
		    	  }else if(grade >= 3.0) {
		    		  System.out.println("필기 시험 대상자입니다.");
		    	  }else {
		    		  System.out.println("지원할 수 없습니다.");
		    	  }}
		      else {
		    	  System.out.println("지원할 수 없습니다.");
		    	  // 여기에 코드를 삽입하세요
		   }
		
		
	}

}
