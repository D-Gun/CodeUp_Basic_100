package CodeUp1084;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			//StringTokenizer ����Ͽ� readLine��(String) ��ü st�� �Է�
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			//�Է°��� ���� ������ ����(�ټ��� ���� ������ ���� ������ ����)
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//�Ϲ����� System.out.printf�� �ð��ʰ��� �ɸ��Ƿ� BufferedWriter��� �õ�
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
