import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = bf.readLine();
		String value[] = s.split(" ");
		if (value.length > 1 && value[0].equals("")) {
			System.out.println((value.length) - 1);
		} else {
			System.out.println(value.length);
		}
	}
}
