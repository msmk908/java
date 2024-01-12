package ch13.test.q6;

import java.util.Scanner;

public class Student {
	// 객체 변수들
	String name; // 이름
	int quizscore; // 퀴즈 점수
	int midtermscore; // 중간시험 점수
	int finalscore; // 기말시험 점수

	// 생성자메소드: 학생의 이름을 넘겨 받아 객체를 생성한다
	public Student(String studentName) {
		this.name = studentName;
	}

	// 학생의 이름을 반환한다
	public String getName() {
		return name;
	}

	// 학생의 퀴즈 점수를 반환한다
	public int getQuizScore() {
		return quizscore;
	}

	// 학생의 중간시험 점수를 반환한다
	public int getMidtermScore() {
		return midtermscore;
	}

	// 학생의 기말시험 점수를 반환한다
	public int getFinalScore() {
		return finalscore;
	}

	// 현 Student 객체의 정보에 대한 문자열을 반환한다.
	public String toString() {
		String str = "";
		str += "이름: " + name + "\n";
		str += "퀴즈 점수: " + quizscore + "\n";
		str += "중간시험 점수: " + midtermscore + "\n";
		str += "기말시험 점수: " + finalscore;
		return str;
	}

	// 이름을 주어진 값으로 변경한다
	public void setName(String Name) {
		this.name = Name;
	}

	// 퀴즈 점수를 주어진 값으로 변경한다
	public void setQuizScore(int QuizScore) {
		this.quizscore = QuizScore;
	}

	// 중간시험 점수를 주어진 값으로 변경한다
	public void setMidtermScore(int MidtermScore) {
		this.midtermscore = MidtermScore;
	}

	// 기말시험 점수를 주어진 값으로 변경한다
	public void setFinalScore(int FinalScore) {
		this.finalscore = FinalScore;
	}

	// 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
	// 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
	public void inputGrades() {
		Scanner scan = new Scanner(System.in);
		System.out.print(name+"의 퀴즈 점수를 입력하라: ");
		quizscore = scan.nextInt();
		while(true) {
		if(quizscore<0 || quizscore>100){
			System.out.println("퀴즈 점수가 0보다 작거나 100보다 크다.");
			System.out.print(name+"의 퀴즈 점수를 다시 입력하라: ");
			quizscore = scan.nextInt();
		}else {
			break;
		}
		} 
		System.out.print(name+"의 중간시험 점수를 입력하라: ");
		midtermscore = scan.nextInt();
		while(true) {
			if(midtermscore<0 || midtermscore>100){
				System.out.println("중간시험 점수가 0보다 작거나 100보다 크다.");
				System.out.print(name+"의 중간시험 점수를 다시 입력하라: ");
				midtermscore = scan.nextInt();
			}else {
				break;
			}
			} 
		System.out.print(name+"의 기말시험 점수를 입력하라: ");
		finalscore = scan.nextInt();
		while(true) {
			if(finalscore<0 || finalscore>100){
				System.out.println("기말시험 점수가 0보다 작거나 100보다 크다.");
				System.out.print(name+"의 기말시험 점수를 다시 입력하라: ");
				finalscore = scan.nextInt();
			}else {
				break;
			}
			} 
	}

	// 학생의 시험 점수들의 총점을 계산하여 반환한다
	public double getTotal() {
		double total = (double) quizscore * 20 / 100 + (double) midtermscore * 30 / 100
				+ (double) finalscore * 50 / 100;
		return total;
	}

	// 학생의 학점을 반환한다
	public String roll() {
		double total = (double) quizscore * 20 / 100 + (double) midtermscore * 30 / 100
				+ (double) finalscore * 50 / 100;
		String grade = null;
		if (total >= 90) {
			grade = "A";
		} else if (total >= 80 && total < 90) {
			grade = "B";
		} else if (total >= 70 && total < 80) {
			grade = "C";
		} else if (total >= 60 && total < 70) {
			grade = "D";
		} else if (total < 60) {
			grade = "F";
		}
		return grade;
	}
}