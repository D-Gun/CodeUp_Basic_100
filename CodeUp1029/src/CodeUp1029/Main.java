package CodeUp1029;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		double sToDouble = Double.parseDouble(s);
		System.out.printf("%.11f",sToDouble);
		//System.out.println(sToDouble); //�ش� ������ �ڸ����� ���߾� 0�� ǥ������ �ʴ´�
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
}
