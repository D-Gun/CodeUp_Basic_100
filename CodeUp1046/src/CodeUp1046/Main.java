package CodeUp1046;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		int[] sSplitToIntArray = new int[sSplit.length];
		int sum = 0;
		float avr = 0;
		for (int i = 0; i < sSplitToIntArray.length; i++) {
			sSplitToIntArray[i] = Integer.parseInt(sSplit[i]);
		}
		for (int j = 0; j < sSplitToIntArray.length; j++) {
			sum += sSplitToIntArray[j];
		}
		avr = ((float)sum)/(sSplitToIntArray.length);
		System.out.println(sum);
		System.out.println(avr);
	}

}
