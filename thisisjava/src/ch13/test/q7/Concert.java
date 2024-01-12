package ch13.test.q7;

import java.util.Scanner;

public class Concert {
	// 가수의 이름
	private String singerName;

	// 공연 장소의 수용 인원
	private int capacity;

	// 팔린 티켓 수
	private int ticketsSold = 0;

	// 남은 티켓 수
	int ticketsLeft;

	// 변수들
	// 인터넷 티켓 가격, 현장 티켓 가격, 총 판매 금액과 인터넷 판매 가능 여부
	int costOverWeb = 0;
	int costAtVenue = 0;
	int totalCost = 0;
	boolean webSale = true;

	// 생성자 메소드
	// 가수의 이름, 공연 장소의 수용 인원, 인터넷 티켓 가격과 현장 티켓 가격을
	// 각각 주어진 값으로 초기화하면서 객체를 생성한다
	public Concert(String name, int max, int costOverWeb, int costAtVenue) {
		this.singerName = name;
		this.capacity = max;
		this.ticketsLeft = max;
		this.costOverWeb = costOverWeb;
		this.costAtVenue = costAtVenue;
	}

	// 티켓을 판다
	public void doTicketSale() {
		// 남은 티켓들의 수를 알려 준다
		System.out.print("파는 티켓들 수는? (최대 " + getTicketsLeft(0) + ") ");

		// 구매 요청한 티켓 수를 입력 받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 티켓 수: ");
		int toSell = sc.nextInt();

		// 티켓을 판다
		boolean saleCompleted = sellTickets(toSell);

		// 판매가 완료되면 티켓들의 총 가격을 출력하고
		// 티켓을 판매할 수 없으면 오류 메시지를 출력한다

		if (saleCompleted == true) {
			if (webSale == true) {
				System.out.println("티켓들의 총 가격= " + toSell * costOverWeb);
				System.out.println("남은 티켓들의 수: " + getTicketsLeft(toSell));
				getTicketSold2(toSell);
				getTotalSales2(toSell);
			} else {
				System.out.println("티켓들의 총 가격= " + toSell * costAtVenue);
				System.out.println("남은 티켓들의 수: " + getTicketsLeft(toSell));
				getTicketSold2(toSell);
				getTotalSales3(toSell);
			}
		} else {
			System.out.println("죄송하지만. 판매를 완료할 수 없습니다.");
			System.out.println("남은 티켓들의 수: " + getTicketsLeft(0));
		}
	}

	// 구매 요청한 수만큼 티켓을 판다
	// 티켓을 판매할 수 있으면 판매 기록을 갱신하고 true를 반환한다
	// 티켓을 판매할 수 없으면 false를 반환한다
	public boolean sellTickets(int number) {

		if (getTicketsLeft(0) >= number) {

			return true;
		} else {
			return false;
		}

	}

	// 구매 요청한 티켓들의 가격을 계산한 후 반환한다
	public int getSaleCost(int number) {
		int saleCost = costOverWeb * number;
		return saleCost;
	}

	// 인터넷 판매를 종료한다
	public void webSalesOver() {
		webSale = false;
	}
	public void getTicketSold2(int number) {
		ticketsSold += number;
	}
	
	
	// 팔린 티켓들의 수를 알려 준다
	public int getTicketsSold() {
		return ticketsSold;
	}

	// 남은 티켓들의 수를 알려 준다
	public int getTicketsLeft(int number) {
		ticketsLeft -= number;
		return ticketsLeft;
	}

	public void getTotalSales2(int number) {
		totalCost += number * costOverWeb;
	}
	public void getTotalSales3(int number) {
		totalCost += number * costAtVenue;
	}
	
	// 총 판매 금액을 알려 준다
	public int getTotalSales() {
		return totalCost;
	}

	// 인터넷 판매 가능 여부를 알려 준다
	public boolean webSalesOnly() {
		return webSale;
	}

	// 팔린 티켓 수와 총 판매 금액을 반환한다
	public String getSalesReport() {
		String str = "";
		str = singerName + " 콘서트 티켓 판매 내역:\n팔린 티켓 수: " + getTicketsSold() + " 총 판매 금액 " + getTotalSales();
		return str;
	}
}
