package CodeUp1077;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			int b = 0;
			int sum = 0;
			do {
				if ((b % 2) == 0) {
					sum += b;
				}				
				b++;
			}while(b <= a);
			System.out.println(sum);
		}catch (IOException e) {
			System.out.println(e);
		}
	}

}
