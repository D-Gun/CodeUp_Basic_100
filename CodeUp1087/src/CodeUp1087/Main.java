package CodeUp1087;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int n = Integer.parseInt(s);
		int a = 0;
		for (int i = 1; i < n; i++) {
			a += i;
			if (a >= n) {
				System.out.println(a);
				break;
			}
		}
		if (n < 2) {
			System.out.println(1);
		}
	}
}
