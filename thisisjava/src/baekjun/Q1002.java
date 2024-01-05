package baekjun;

import java.util.Scanner;

public class Q1002 {

	public static void main(String[] args) {
		int T;
		int t = 0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int x1, y1, r1, x2, y2, r2;

			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();

			int plus = r1 + r2;
			int mnus = Math.abs(r1 - r2);
			double D = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			if (D > plus) {
				t = 0;
			}
			if (D == plus) {
				t = 1;
			}
			if (D < plus) {
				if (D == mnus) {
					t = 1;
				} else if (D < mnus) {
					t = 0;
				} else {
					t = 2;
				}
			}
			if (D==0 && r1==r2) {
				t = -1;
			}
			System.out.println(t);
		}
	}

}
