package CodeUp1041;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		char a = s.charAt(0);
		a += 1;
		System.out.println(a);
	}
}
