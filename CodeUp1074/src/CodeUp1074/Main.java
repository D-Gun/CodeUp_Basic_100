package CodeUp1074;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			while (a > 0) {
				System.out.println(a);
				a--;
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
