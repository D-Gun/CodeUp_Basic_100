package CodeUp1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			while (a > 0) {
				a--;
				System.out.println(a);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
