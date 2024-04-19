package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(N + " " + X);
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}

		for (int i = 0; i < ar.length; i++) {
			if (X > ar[i]) {
				System.out.print(ar[i] + " ");
			}
		}
	}
}
