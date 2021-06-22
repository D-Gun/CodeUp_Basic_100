package CodeUp1052;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sSplit = s.split(" ");
			if (sSplit[0].equals(sSplit[1])) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
