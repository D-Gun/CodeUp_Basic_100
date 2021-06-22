package CodeUp1082;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.parseInt(s);
		String b = String.format("%X", a);
		for (int i = 0; i < 16; i++) {
			int result  = a * i;
			System.out.printf("%x*%d=%d\n",b,i,result);
		}
		
	}
}
