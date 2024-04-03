package q2884;

import java.util.Scanner;
//1 10 - 0 25
//0 45 - 0 0

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

//		System.out.println(H);
//		System.out.println(M);

		if (M < 60) {
			H -= 1;
			M += 60;
		}
		M -= 45;
		if (M >= 60) {
			H += 1;
			M -= 60;
		}
		if (H <= 0) {
			H = 24 + H;
		}
		if (H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}
}
