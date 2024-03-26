package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		for (int i = 0; i < hat.length; i++) {
			hat[i] = sc.nextInt();
		}
		sc.close();

		// print
		for (int i = 0; i < hat.length; i++) {
			System.out.print(hat[i] + " ");
		}

		// 9개의 수 합을 구하기
		int sum = 0;
		for (int i = 0; i < hat.length; i++) {
			sum += hat[i];
		}
		System.out.println("sum : " + sum);

		// 합계에서 제외 할 2개의 수를 선정
		int ai = -1, aj = -1;
		for (int i = 0; i < hat.length; i++) {
			for (int j = 0; j < hat.length; j++) {
				if (i != j) {
					System.out.print(i + " : " + j + " = " + (hat[i] + hat[j]));
					System.out.println("~> " + (sum - (hat[i] + hat[j])));

					if ((sum - (hat[i] + hat[j]) == 100)) {
						ai = i;
						aj = j;
						break;
					}
				}
			}
		}

		for (int k = 0; k < hat.length; k++) {
			if (k != ai && k != aj)
				System.out.println(hat[k]);
		}
	}
}
