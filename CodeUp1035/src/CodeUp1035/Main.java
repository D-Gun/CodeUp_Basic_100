package CodeUp1035;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int a = Integer.valueOf(s,16); // String s 를 16진수로 변환 후 int a에 저장
		System.out.printf("%o",a);
	}
}
