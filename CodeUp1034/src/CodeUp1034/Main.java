package CodeUp1034;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		int b = Integer.valueOf(s,8);//string s�� 8������ ��ȯ�Ͽ� int b�� ����
		
		System.out.printf("%d",b);
	}
}
