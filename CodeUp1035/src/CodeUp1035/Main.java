package CodeUp1035;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.valueOf(s,16); // String s �� 16������ ��ȯ �� int a�� ����
		System.out.printf("%o",a);
	}
}
