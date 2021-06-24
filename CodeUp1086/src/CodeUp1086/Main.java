package CodeUp1086;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		double w = Integer.parseInt(st.nextToken());
		double h = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		
		double result1 = 0;
		result1 = w*h*b;
		float result2 = 0;
		result2 = (float)(((result1)/8)/1024)/1024;
		System.out.printf("%.2f MB",result2);
	}

}