package CodeUp1079;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sSplit = s.split(" ");
			for (int i = 0; i < sSplit.length; i++) {
				if(sSplit[i].equals("q")) {
					System.out.println("q");
					break;
				} else {
					System.out.println(sSplit[i]);
					continue;
				}
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}