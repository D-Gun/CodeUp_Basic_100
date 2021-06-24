package CodeUp1093;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		int si3 = Integer.parseInt(s1); // �θ� ������ ���� ����
		String[] p = s2.split(" ");
		Integer[] a = new Integer[si3]; // �ҷ��� ���ڸ� �����ϴ� �迭
		Integer[] b = new Integer[23]; // 1~23 ������ �迭
		Arrays.fill(b, 0);
		for (int i = 0; i < si3; i++) {
			a[i] = Integer.parseInt(p[i]);
		}
		//������ �ҷ��� Ƚ���� 23��¥�� �迭�� ����(�迭�� 0~22���� �ε����� 1���� 23������ ����)
		for (int k = 1; k < 24; k++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == k) {
					b[k-1] += 1;
				}
			}
			System.out.printf("%d ",b[k-1]);
		}			
	}
}
