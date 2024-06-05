package q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] bucket = new int[N];
		for (int t = 0; t < M; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

//			System.out.println(i + " " + j + " " + k);
			for (int u = i - 1; u <= j - 1; u++) {
				bucket[u] = k;
			}
		}
		sc.close();

		for (int u = 0; u < bucket.length; u++) {
			System.out.print(bucket[u] + " ");
		}
		System.out.println();
	}
}
