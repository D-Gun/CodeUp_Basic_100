package CodeUp1066;

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
		for (int j = 0; j < a.length; j++) {
			if ((a[j] % 2) == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}