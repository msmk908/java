package ch06.Q;

import java.util.Scanner;

public class BankApplication {
	   
	   private static Account[] accountArray = new Account[100];  // 계좌 여러명 생성하기 위해 배열
	   private static Scanner scan = new Scanner(System.in);

	   public static void main(String[] args) {
	      boolean run = true;
	      while(run) {
	         System.out.println("-------------------------------------------");
	         System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	         System.out.println("-------------------------------------------");
	         System.out.print("선택> ");
	         
	         int selectNo = Integer.parseInt(scan.nextLine());
	         
	         if(selectNo == 1) {
	            createAccount();
	         }else if(selectNo == 2) {
	            accountList();
	         }else if(selectNo == 3) {
	            deposit();
	         }else if(selectNo == 4) {
	            withdraw();
	         }else if(selectNo == 5) {
	            run = false;
	         }
	         
	      }
	      System.out.println("프로그램 종료");
	   }
	   
	   private static void createAccount() {
	      System.out.println("--------");
	      System.out.println("계좌생성");
	      System.out.println("--------");
	      
	      System.out.print("계좌번호: ");
	      String ano = scan.nextLine();
	      System.out.print("예금주: ");
	      String owner = scan.nextLine();
	      System.out.print("초기입금액: ");
	      int balance = Integer.parseInt(scan.nextLine());
	      
	      Account newAccount = new Account(ano, owner, balance);   // 입력 받은 값으로 객체 형태 생성
	      for(int i=0; i<accountArray.length; i++) {   // accountArray 배열 이용
	         if(accountArray[i] == null) {          // 배열에 null(빈곳이 있는지 확인)
	            accountArray[i] = newAccount;       // 배열 빈곳에 신규 가입자 데이터 넣기(객체형태로 넣기)
	            System.out.println("결과: 계좌가 생성되었습니다.");  
	            break;
	         }
	      }
	   }
	   
	   private static void accountList() {
	      System.out.println("--------");
	      System.out.println("계좌목록");
	      System.out.println("--------");
	      for(int i=0; i<accountArray.length; i++) {
	         Account account = accountArray[i];   // 배열에 들어가 있는 값들을 객체에 넣어서 출력
	         if(account != null) {
	            System.out.print(account.getAno());
	            System.out.print("     ");
	            System.out.print(account.getOwner());
	            System.out.print("     ");
	            System.out.print(account.getBalance());
	            System.out.println();
	         }
	      }
	   }
	   private static void deposit() {
	      System.out.println("--------");
	      System.out.println("예금");
	      System.out.println("--------");
	      System.out.print("계좌번호: ");
	      String ano = scan.nextLine();                   // 계좌 번호 입력 : 검색 
	      System.out.print("예금액: ");      
	      int money = Integer.parseInt(scan.nextLine());  // balance + 예금액  
	      Account account = findAccount(ano);            // 계좌 번호가 일치하는 배열의 객체를 가져
	      if(account == null) {
	         System.out.println("결과: 계좌가 없습니다.");
	         return;         
	      }
	      account.setBalance(account.getBalance() + money);  // 예금액을 증가
	      System.out.println("결과: 예금이 성공되었습니다.");
	   }
	   
	   private static void withdraw() {
	      System.out.println("--------");
	      System.out.println("출금");
	      System.out.println("--------");
	      System.out.print("계좌번호: ");
	      String ano = scan.nextLine();
	      System.out.print("출금액: ");
	      int money = Integer.parseInt(scan.nextLine());
	      Account account = findAccount(ano);   // 계좌 번호가 일치한 배열을 객체로 받아오기
	      if(account == null) {
	         System.out.println("결과: 계좌가 없습니다.");
	         return;         
	      }
	      account.setBalance(account.getBalance() - money);  // 예금액 감소
	      System.out.println("결과: 출금이 성공되었습니다.");
	   }   
	   
	   private static Account findAccount(String ano) {
	      Account account = null;            // 담을 객체를 미리 선언
	      for(int i=0; i<accountArray.length; i++) {    // 배열 안에 있는거 하나씩 처리
	         if(accountArray[i] != null) {           // 배열에 null이 아니면 
	            String dbAno = accountArray[i].getAno();  // 배열 안에 있는 계좌번호 ano
	            if (dbAno.equals(ano)) {             // 배열 안에 ano와 입력한 ano 비교
	               account = accountArray[i];         // 배열에 있는거를 객체 담기
	               break;
	            }
	         }
	      }
	      return account;                           // 객체 반환
	   }
	}
