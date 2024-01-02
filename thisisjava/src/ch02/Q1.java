package ch02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchaseAmount;
		int claimAmount;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 금액: ");
		purchaseAmount = scan.nextInt();
		
		if (purchaseAmount>=300000) {
			claimAmount = purchaseAmount - 30000;
		}else if(purchaseAmount>=100000){
			claimAmount = purchaseAmount - 5000;
		}else {
			claimAmount = purchaseAmount;
		}
		System.out.println("청구 금액: "+claimAmount);
		
	}

}
