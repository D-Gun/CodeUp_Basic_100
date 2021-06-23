package GCFTest;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

import CodeUp1092.Main;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sS = s.split(" ");
		Integer[] a = new Integer[sS.length];
		Main m = new Main();
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sS[i]);
		}
		System.out.println(m.getGCF(a[0],a[1]));
	}
	public Integer getGCF(Integer a, Integer b) {
		Integer bn = 0;
		Integer sn = 0;
		Integer tmp = 0;
		Integer n = 2;
		if(a < b) {
			//ū���� ������ �����Ͽ� ����
			bn = b;
			sn = a;
			
			//��� �����Ͽ� ���� �� a,b�� ���� �ٲ���´�(�Ʒ� while������ %����� a�� ū �����̾�� �ϹǷ�.)
			tmp = a;
			a = b;
			b = tmp;
		}else {
			//ū���� ������ �����Ͽ� ����
			bn = a;
			sn = b;
		}
		while (n != 0) {
			if (n == 1) {
				return sn;
			} else {
				n = a % b;
				a = b;
				b = n;
			}
		}
		return a;
	}

}
// ������ ���� �ּ� ����� ���ϱ� �õ��ߴ� �κ�.
//public class Main {
//	
//	public static void main(String[] args) throws IOException{
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String s = bf.readLine();
//		String[] sS = s.split(" ");
//		Integer[] a = new Integer[sS.length];
//		Main m = new Main();
//		for (int i = 0; i < a.length; i++) {
//			a[i] = Integer.parseInt(sS[i]);
//		}
//		m.solution(a);
//	}
//	
//	public void solution(Integer[] arr) {
//		Arrays.sort(arr, Collections.reverseOrder());
//		Integer gcf = 0;
//		Integer lcm = 0;
//		//gcf
//		
//		gcf = getGCF(getGCF(arr[0],arr[1]),arr[2]);
//		for (int i = 0; i < arr.length; i++) {
//			if (gcf == arr[i]) {
//				lcm = arr[0]*arr[1]*arr[2];
//			}else {
//				lcm = (arr[0]*arr[1]*arr[2]) / gcf;
//			}
//		}
//		
//		//�ּҰ����(LCM) ���
//		System.out.println(lcm);
//	}
//	public Integer getGCF(Integer a, Integer b) {
//		Integer bn = 0;
//		Integer sn = 0;
//		Integer tmp = 0;
//		Integer n = 2;
//		if(a < b) {
//			//ū���� ������ �����Ͽ� ����
//			bn = b;
//			sn = a;
//			
//			//��� �����Ͽ� ���� �� a,b�� ���� �ٲ���´�(�Ʒ� while������ %����� a�� ū �����̾�� �ϹǷ�.)
//			tmp = a;
//			a = b;
//			b = tmp;
//		}else {
//			//ū���� ������ �����Ͽ� ����
//			bn = a;
//			sn = b;
//		}
//		while (n != 0) {
//			if (n == 1) {
//				return sn;
//			} else {
//				n = a % b;
//				a = b;
//				b = n;
//			}
//		}
//		return a;
//	}
//
//}
