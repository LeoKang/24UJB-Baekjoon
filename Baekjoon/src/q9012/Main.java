package q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String inp = sc.next();
//			System.out.println(inp);

			int cnt = 0;
			boolean b = true;
			for (int j = 0; j < inp.length(); j++) {
				if(inp.charAt(j) == '(') {
					cnt++;
				}else {	// ')'
					cnt--;
				}
				
				if(cnt < 0) {
					b = false;
				}		
			}
//			System.out.println(cnt);
			if(b == false || cnt != 0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
