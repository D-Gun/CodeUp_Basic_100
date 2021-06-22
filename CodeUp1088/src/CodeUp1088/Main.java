package CodeUp1088;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		for (int i = 1; i <= a; i++) {
			if (i % 3 != 0) {
				s += i + " ";
			} else {
				continue;
			}
		}
		bfw.write(s);
		bfw.flush();
	}

}
