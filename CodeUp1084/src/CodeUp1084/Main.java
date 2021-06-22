package CodeUp1084;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			//StringTokenizer 사용하여 readLine값(String) 객체 st에 입력
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			//입력값에 따라 변수에 저장(다수의 변수 저장은 힘들 것으로 보임)
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//일반적인 System.out.printf는 시간초과에 걸리므로 BufferedWriter사용 시도
			BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			//red
			for (int j = 0; j < r; j++) {
				String s1 = "";
				//green
				for (int k = 0; k < g; k++) {
					//blue
					//String s1 = "";
					for (int l = 0; l < b; l++) {
						s1 += j + " " + k + " " + l + "\n";
					}
					bfw.write(s1);
					bfw.flush();
				}
			}
			System.out.println(r*g*b);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
