package CodeUp1037;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			char b = (char)a;
			System.out.println(b);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
