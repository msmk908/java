package ch13.test.q7;

import java.util.Scanner;

public class ConcertDriver {
	public static void main(String[] args) {
		// 가수의 이름은 ‘가수왕’이고 공연 장소의 수용 인원은 100명이고
		// 인터넷 티켓 가격은 10,000원이고 현장 티켓 가격은 20,000원인
		// Concert 객체를 만든다
		Concert concert = new Concert("가수왕", 100, 10000, 20000);

		System.out.println("콘서트 판매 프로그램을 시작합니다");

		Scanner reader = new Scanner(System.in);

		boolean done = false;

		// 티켓 판매가 종료될 때까지 티켓을 판다
		while (!done) {
			// 티켓 판매 방법을 입력받는다
			if (concert.webSalesOnly())
				System.out.print("\n인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
			else
				System.out.print("\n현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");

			String response = reader.next();

			// 티켓 판매 방법에 따라 티켓을 판다
			// 판매 종료를 원하면 판매를 종료하게 만든다
			// 인터넷 판매이면 티켓을 인터넷 가격으로 판다
			// 현장 판매로 바꾸기를 원하면 티켓을 현장 가격으로 판다
			// 티켓 판매 방법이 틀리게 입력되면 오류 메시지를 출력한다.

			if(response.equals("S")) {
				concert.doTicketSale();
			}else if(response.equals("V")) {
				concert.webSalesOver();
				System.out.println("남은 티켓들의 수: "+concert.getTicketsLeft(0));
			}else if(response.equals("F")) {
				System.out.println("남은 티켓들의 수: " + concert.getTicketsLeft(0));
				System.out.println("최종 판매 보고서\n\n"+concert.getSalesReport());
				System.out.println("계속하려면 아무 키나 누르십시오 . . . ");
				break;
			}else {
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("남은 티켓들의 수: "+concert.getTicketsLeft(0));
			}

			// 판매 후 남은 티켓들의 수를 출력한다

			// 여기에 코드를 삽입하세요
		}

		// 팔린 티켓 수와 총 판매 금액을 출력한다

		// 여기에 코드를 삽입하세요
	}
}