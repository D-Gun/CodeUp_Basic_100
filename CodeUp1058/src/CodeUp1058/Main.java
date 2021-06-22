package CodeUp1058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sSplit = s.split(" ");
		int[] sSplitToIntArray = new int[sSplit.length];
		for (int i = 0; i < sSplit.length; i++) {
			sSplitToIntArray[i] = Integer.parseInt(sSplit[i]);
		}
		
		if ((sSplitToIntArray[0] == 0) && (sSplitToIntArray[1] == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
