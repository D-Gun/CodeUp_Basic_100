package CodeUp1098;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//������ ũ�� �Է�
		String s1 = bf.readLine();
		String[] boardSize = s1.split(" ");
		int w = Integer.parseInt(boardSize[0]);
		int h = Integer.parseInt(boardSize[1]);
		int[][] board = new int[w][h];
		for (int e = 0; e < w; e++) {
			Arrays.fill(board[e], 0); //������ 0���� �Է�
		}
		
		//������ ���� �Է�
		String s2 = bf.readLine();
		int numOfStick = Integer.parseInt(s2);
				
		//����, ����, ��ǥ �Է¹ް�, ���� ����
		for (int rotate = 0; rotate < numOfStick; rotate++) {
			String s3 = bf.readLine();
			//�Է¹����� �迭�� ����
			//stickInfo[0]: ����, stickInfo[1]: ����(0�� ����, 1�� ����), stickInfo[2],stickInfo[3]: xy��ǥ
			String[] stickInfo = new String[4];
			stickInfo =	s3.split(" ");
			int l = Integer.parseInt(stickInfo[0]);
			int d = Integer.parseInt(stickInfo[1]);
			int x = Integer.parseInt(stickInfo[2])-1;
			int y = Integer.parseInt(stickInfo[3])-1;
			for (int a = 0; a < l; a++) {
				if (d == 0) { //������ ���� ����
					board[x][y + a] = 1;
				} else if (d == 1) { //������ ���� ����
					board[x + a][y] = 1;
				}
				
			}
		}
		
		//����� ���
		for (int c = 0; c < w; c++) {
			for (int d = 0; d < h; d++) {
				System.out.printf("%d ",board[c][d]);
			}
			System.out.println();
		}
	}
}
