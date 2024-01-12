package ch13.test.q4;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		String flag = "예";
		PairOfDice dice = new PairOfDice();
		Player player1, player2;

		player1 = new Player("홍길동");
		player2 = new Player("이순신");

		Scanner scan = new Scanner(System.in);
		do {
		System.out.println(player1.getName());
		player1.roll(dice); // 플레이어1 주사위를 던진다

		System.out.println(player2.getName());
		player2.roll(dice); // 플레이어2 주사위를 던진다
		
		if(player1.getTotal()>player2.getTotal()) {
			System.out.println(player1.getName()+" 플레이어가 이겼다.");
		}else if (player1.getTotal()==player2.getTotal()) {
			System.out.println("비겼다.");
		}else {
			System.out.println(player2.getName()+" 플레이어가 이겼다.");
		}
		
		System.out.println("\n 게임을 계속 하시겠습니까?");
		flag = scan.next();
		}while(flag.equals("예"));
		

	}

}
