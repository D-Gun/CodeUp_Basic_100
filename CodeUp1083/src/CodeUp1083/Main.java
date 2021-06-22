package CodeUp1083;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			for (int i = 1; i <= a; i++) {
				if(i == 3 || i == 6 || i == 9) {
					System.out.printf("X ");
				}else {
					System.out.printf("%d ",i);
				}
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
