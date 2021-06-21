package CodeUp1032;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			System.out.printf("%x",a);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
