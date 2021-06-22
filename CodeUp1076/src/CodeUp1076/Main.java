package CodeUp1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			char a = s.charAt(0);
			int b = 97;
			
			do {
				System.out.println((char)b);
				b++;
			}while(b <= (int)a);
			
			
//			//whlie로 하면 아래와 같다.
//			while (b <= (int)a) {
//				System.out.println((char)b);
//				b++;
//			}
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
