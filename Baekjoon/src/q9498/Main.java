package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

		System.out.println(score);

		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default: 
			System.out.println("F");
			break;
		}
		
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
	}
}
