package CodeUp1042;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sArray = s.split(" ");
			int[] sToIntArray = new int[sArray.length];
			int result = 0;
			
			for (int i = 0; i < sArray.length; i++) {
				sToIntArray[i] = Integer.parseInt(sArray[i]);
			}
			result = sToIntArray[0]/sToIntArray[1];
			System.out.println(result);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
