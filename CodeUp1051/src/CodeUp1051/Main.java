package CodeUp1051;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sSplit = s.split(" ");
			if (Integer.parseInt(sSplit[1]) >= Integer.parseInt(sSplit[0])) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
