package CodeUp1028;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			Long sToLong = Long.parseLong(s);
			System.out.println(sToLong);
		}
		catch (IOException e){
			System.out.println(e);
		}
	}

}
