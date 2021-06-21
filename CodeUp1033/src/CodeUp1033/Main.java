package CodeUp1033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			System.out.printf("%X",a);
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
