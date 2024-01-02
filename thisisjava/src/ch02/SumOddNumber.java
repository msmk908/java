package ch02;

public class SumOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for ( int i=1; i <= 100 ; i+=2 ) {
			sum+=i;
		}
		System.out.println(sum);
		
		for ( int j = 31; j <= 50; j+=2 ) {
			System.out.println(j+1);
		} // 31부터 50까지의 짝수 출력
		
	}

}
