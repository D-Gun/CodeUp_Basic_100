package CodeUp1072;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//ù��° �Է� ������ŭ�� int �迭 ����
		String s1 = bf.readLine();
		s1 = s1.replaceAll(" ", "");
		int arrayCount = Integer.parseInt(s1);
		int[] a = new int[arrayCount];
		
		//���� �Է¹޾� ���
		String s2 = bf.readLine();
		String[] sSplit = s2.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sSplit[i]);
		}
		for (int item : a) {
			System.out.println(item);
		}
	}
}
