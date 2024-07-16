package q14489;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();
				
		BigInteger ba = new BigInteger(A);
		BigInteger bb = new BigInteger(B);
		BigInteger bc = new BigInteger(C);

		BigInteger br = ba.add(bb);
		BigInteger bc2 = bc.add(bc);
		
		if(br.compareTo(bc2) < 0) {
			System.out.println(br);
		}else {
			BigInteger bsum = ba.add(bb);
			BigInteger bmul = bc.add(bc);
			System.out.println(bsum.subtract(bmul));
		}
	}
}
