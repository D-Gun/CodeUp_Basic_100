package CodeUp1095;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		int n = Integer.parseInt(s1);
		String s2 = bf.readLine();
		String[] s3 = s2.split(" ");
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s3[i]);
		}
		Arrays.sort(a);
		System.out.println(a[0]);
	}
}
