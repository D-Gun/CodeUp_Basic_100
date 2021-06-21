package CodeUp1038;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sArray = s.split(" ");
			long result = 0;
			long[] sArrayToLong = new long[sArray.length];
			for (int i = 0; i < sArray.length; i++) {
				sArrayToLong[i] = Long.parseLong(sArray[i]);
			}
			result = sArrayToLong[0] + sArrayToLong[1];
			System.out.println(result);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
