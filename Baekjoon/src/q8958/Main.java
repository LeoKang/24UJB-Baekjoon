package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int sum = 0, score = 1;
			String inp = sc.next();
//			System.out.println(inp);

			for (int j = 0; j < inp.length(); j++) {
				if(inp.charAt(j) == 'O') {
					sum += score++;
				}else {	// 'X'
					score = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
