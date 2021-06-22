package CodeUp1081;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		
		int[] sIntArray = new int[sSplit.length];
		
		for (int i = 0; i < sIntArray.length; i++) {
			sIntArray[i] = Integer.parseInt(sSplit[i]);
		}
		
		for (int j = 1; j <= sIntArray[0]; j++) {
			for (int k = 1; k <= sIntArray[1]; k++) {
				System.out.printf("%d %d\n",j,k);
			}
		}
	}
}
