package q2720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int C = sc.nextInt();

			// 124 Cent -> 25 * 4 + 10 * 2 + 5 * 0 + 1 * 4
			int q = C / 25;
			C -= (q * 25);
			int d = C / 10;
			C -= (d * 10);
			int n = C / 5;
			C -= (n * 5);
			
			System.out.println(q + " " + d + " " + n + " " + C);
		}
		sc.close();
	}
}
