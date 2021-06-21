package CodeUp1048;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		int result = 0;		
		int[] a = new int[sSplit.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sSplit[i]);
		}
		
		result = a[0] << a[1];
		System.out.println(result);
	}

}
