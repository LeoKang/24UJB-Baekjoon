package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		System.out.println(N);

		for (int i = 0; i < N; i++) {
			// ' ' ���
			for (int j = N - i - 1; j > 0; j--) {
				System.out.print("?");
			}
			// '*' ���
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// println()
			System.out.println();
		}
	}
}
