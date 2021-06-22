package CodeUp1064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		int[] a = new int[sSplit.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sSplit[i]); 
		}
		System.out.println((a[0] < a[1]? a[0] : a[1]) < a[2] ? (a[0] < a[1]? a[0] : a[1]) : a[2]);
	}

}