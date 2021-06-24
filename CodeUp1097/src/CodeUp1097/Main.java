package CodeUp1097;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][] board = new int[19][19]; //�ٵ��� �迭 ����
		
		//���� �ٵ��� ���� �����ϱ�
		for (int a = 0; a < board.length; a++) {
			//String�� �ʱ�ȭ
			String s1 = "";
			String[] in = null;			
			
			s1 = bf.readLine();
			in = s1.split(" ");
			
			// ���� ���ڷ� ��ȯ
			int[] r = new int[19]; 
			for (int b = 0; b < r.length; b++) {
				r[b] = Integer.parseInt(in[b]); 
			}
			
			//�ٵ��� �迭�� �Է°� ����
			if (a < 19) {
				for (int j = 0; j < 19; j++) {
					board[a][j] = r[j];
				}
			}
		}
		
		//�Է¹��� ��ǥ�� ���� ������(��ǥ�� �Է� ���� ������ ������ ����, ��ǥ������ŭ �ݺ�)
		//��ǥ�� ���� �Է�
		String s2 = bf.readLine();		
		int n = Integer.parseInt(s2);
		
		//������ ����
		for (int h = 0; h < n; h++) { //��ǥ ������ŭ ����
			
			//��ǥ�� �Է¹ޱ� (s4[0] = x��ǥ, s4[1] = y��ǥ)
			String s3 = bf.readLine();
			String[] s4 = s3.split(" ");
			int s4x = Integer.parseInt(s4[0]);
			int s4y = Integer.parseInt(s4[1]);
			
			for (int x = 0; x < board.length; x++) {//������ ������
				if (board[x][s4y-1] == 0) {
					board[x][s4y-1] = 1;
				} else {
					board[x][s4y-1] = 0;
				}
			}
			for (int y = 0; y < board.length; y++) {//������ ������
				if (board[s4x-1][y] == 0) {
					board[s4x-1][y] = 1;
				} else {
					board[s4x-1][y] = 0;
				}
			}
		}
		
		//��� ���
		for (int e = 0; e < board.length; e++) {
			for (int f = 0; f < board.length; f++) {
				System.out.printf("%d ",board[e][f]);
			}
			System.out.println();
		}
	}
}
