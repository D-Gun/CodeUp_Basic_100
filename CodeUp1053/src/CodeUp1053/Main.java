package CodeUp1053;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.parseInt(s);
		
		if (a == 1) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}

}
