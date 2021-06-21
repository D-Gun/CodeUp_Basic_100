package CodeUp1030;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			long a = Long.parseLong(s);
			System.out.printf("%d", a);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
