package CodeUp1073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		int[] a = new int[sSplit.length];
		for (int i = 0; i < sSplit.length; i++) {
			a[i] = Integer.parseInt(sSplit[i]);
		}
		for (int item : a) {
			if (item != 0) {
				System.out.println(item);
				continue;
			}else if (item == 0) {
				break;
			}
		}
	}
}
