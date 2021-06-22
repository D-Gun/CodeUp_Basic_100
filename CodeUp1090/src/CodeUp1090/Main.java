package CodeUp1090;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		long result = 0;
		
		result = (long)(a*(Math.pow(r, (n-1))));
		System.out.println(result);
	}
}
