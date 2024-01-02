package ch02;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언한다
	      int attendscore;
	      int assignmentscore;
	      int quizscore;
	      int midtermexamscore;
	      int finalexamscore;

	      double total; // 총점을 저장하는 변수를 선언한다
	           // 여기에 코드를 삽입하세요

	      String grade;// 학점을 저장하는 변수를 선언한다
	           // 여기에 코드를 삽입하세요

	      // 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
	      Scanner scan = new Scanner (System.in);

	      // 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
	      // 그리고 입력된 점수를 읽는다.
	      System.out.print("출석 점수를 입력하세요:\t\t");
	      attendscore = scan.nextInt();
	      System.out.print("과제 점수를 입력하세요:\t\t");
	      assignmentscore = scan.nextInt();
	      System.out.print("수시시험 점수를 입력하세요:\t\t");
	      quizscore = scan.nextInt();
	      System.out.print("중간시험 점수를 입력하세요:\t\t");
	      midtermexamscore = scan.nextInt();
	      System.out.print("기말시험 점수를 입력하세요:\t\t");
	      finalexamscore = scan.nextInt();

	      total = attendscore*0.1+assignmentscore*0.4+quizscore*0.1+midtermexamscore*0.2+finalexamscore*0.2;

	      if (100>= total && total >= 90) {
	    	  grade = "A";
	      }else if (total >= 80) {
	    	  grade = "B";
	      }else if (total >= 70) {
	    	  grade = "C";
	      }else if (total >= 60) {
	    	  grade = "D";
	      }else {
	    	  grade = "F";
	      }

	      System.out.println("총점: "+total);
	      System.out.println("학점: "+grade);


	}

}
