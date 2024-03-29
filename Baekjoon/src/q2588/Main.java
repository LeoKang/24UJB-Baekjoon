package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();

//		System.out.println(num1 + " " + num2);
		int inum1 = Integer.parseInt(num1);

		int inum2 = num2.charAt(2) - '0';
		System.out.println(inum1 * inum2);

		inum2 = num2.charAt(1) - '0';
		System.out.println(inum1 * inum2);
		
		inum2 = num2.charAt(0) - '0';
		System.out.println(inum1 * inum2);
		System.out.println(inum1 * Integer.parseInt(num2));
		
//		// case 1 ----------------------------
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sc.close();
//
////		System.out.println(num1 + " " + num2);
//
//		int n1 = num2 % 10;
////		System.out.println(n1);
//		System.out.println(num1 * n1);
//		
//		int n2 = num2 / 10 % 10;
////		System.out.println(n2);
//		System.out.println(num1 * n2);
//		
//		int n3 = num2 / 100;
////		System.out.println(n3);
//		System.out.println(num1 * n3);
//		
//		System.out.println(num1 * num2);
	}
}
