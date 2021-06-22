package CodeUp1068;
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
			if (a[j] >= 90 && a[j] <= 100) {
				System.out.println("A");
			}else if (a[j] >= 70 && a[j] < 90) {
				System.out.println("B");
			}else if (a[j] >= 40 && a[j] < 70) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
		}
	}
}
