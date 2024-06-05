package q18870;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inp = new int[N];
		int[] sorted = new int[N];
		int[] res = new int[N];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		System.out.printf("%10s : ", "inp[]");
		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		System.out.println();

		System.arraycopy(inp, 0, sorted, 0, N);
		Arrays.sort(sorted);

		System.out.printf("%10s : ", "sorted[]");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();

		System.arraycopy(sorted, 0, res, 0, N);

		System.out.printf("%10s : ", "res1[]");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();

		int c = 0;
		int before = sorted[0];
		res[0] = 0;
		for (int i = 0; i < res.length; i++) {
			if (before == sorted[i]) {
				res[i] = c;
			} else {
				before = sorted[i];
				res[i] = ++c;
			}
		}

		System.out.printf("%10s : ", "res2[]");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
		
		
	}
}