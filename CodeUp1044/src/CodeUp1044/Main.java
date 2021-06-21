package CodeUp1044;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			long a = Long.parseLong(s);
			
			a++;
			
			System.out.println(a);
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
