package CodeUp1029;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		double sToDouble = Double.parseDouble(s);
		System.out.printf("%.11f",sToDouble);
		//System.out.println(sToDouble); //해당 구문은 자릿수에 맞추어 0을 표현하지 않는다
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
}
