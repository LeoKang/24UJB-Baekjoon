import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int count = 0;
		int B = input;
		while (true) {
			B = (10 * (B % 10)) + (((B / 10) + (B % 10)) % 10);
			count++;

			if (B == input) {
				System.out.println(count);
				break;
			}
		}
	}
}