package CodeUp1026;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sSplit = s.split(":");
			Integer[] iSplit = new Integer[sSplit.length];
			for (int i = 0; i < iSplit.length-1; i++) {
				iSplit[i] = Integer.parseInt(sSplit[i]);
			}
			System.out.println(iSplit[1]);
			System.out.println();
		}
		catch (IOException e) {
			System.out.println("IOException:" + e);
		}

	}
}
