package CodeUp1034;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		int b = Integer.valueOf(s,8);//string s를 8진수로 변환하여 int b에 저장
		
		System.out.printf("%d",b);
	}
}
