package CodeUp1036;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			char a = s.charAt(0);
			int b = (int)a;
			System.out.println(b);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
