package CodeUp1085;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		double h = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		double s = Integer.parseInt(st.nextToken());
		double result1 = 0;
		result1 = h*b*c*s;
		float result2 = 0;
		result2 = (float)(((result1)/8)/1024)/1024;
		System.out.printf("%.1f MB",result2);
	}

}
