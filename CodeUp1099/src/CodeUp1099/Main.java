package CodeUp1099;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		//�ڽ� ����(���پ� �Է¹޾� �����ϱ�)
		int[][] box = new int[10][10];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < box.length; i++) {
			String s1 = bf.readLine();
			String[] boxLine = s1.split(" ");
			for (int j = 0; j < boxLine.length; j++) {
				box[i][j] = Integer.parseInt(boxLine[j]);
			}
		}	
		
		int breaker = 0;
		//���� ��� ǥ���ϱ�
		for (int a = 1; a < box.length - 1; a++) { // ���� �ش��ϴ� ������ ó������ ����
			for (int b = 1; b < box.length - 1; b++) {
				if (box[1][1] == 2) { //���̰� �������� ���� ��
					box[a][b] = 9;
					breaker = 99;
					break;
				} else if (box[1][1] == 0) {
					box[a][b] = 9;
				}
				if (box[a][b] == 9 && (box[a][b + 1] == 0 || box[a][b + 1] == 2)) { //��λ� ������
					if (box[a][b + 1] != 2) { // ���̰� �ƴϸ�
						box[a][b + 1] = 9; // ���������� ��
					} else if (box[a][b + 1] == 2) { // ���̸�
						box[a][b + 1] = 9;
						breaker = 99;
						break; // �԰� ������
					}
				} else if (box[a][b] == 9 && box[a][b + 1] == 1 && (box[a + 1][b] == 0 || box[a + 1][b] == 2)) { //������ ���� ��������
					if (box[a + 1][b] != 2) { // ���̰� �ƴϸ�
						box[a + 1][b] = 9; // �Ʒ��� ��
					} else if (box[a + 1][b] == 2) { // ���̸�
						box[a + 1][b] = 9;
						breaker = 99;
						break; // �԰� ������
					} 
				} else if (box[a][b + 1] == 1 && box[a + 1][b] == 1) { // �Ʒ�, �������� ���϶�
					breaker = 99;
					break; // ���� ������
				}
			}
			if (breaker == 99) {
				break;
			}else {
				continue;
			}
		}
		
		//����� ���
		for (int c = 0; c < box.length; c++) {
			for (int d = 0; d < box.length; d++) {
				System.out.printf("%d ",box[c][d]);
			}
			System.out.println();
		}
	}
}
