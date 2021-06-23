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
			//큰값과 작은값 구분하여 저장
			bn = b;
			sn = a;
			
			//대소 구분하여 저장 후 a,b의 값을 바꿔놓는다(아래 while문에서 %연산시 a가 큰 숫자이어야 하므로.)
			tmp = a;
			a = b;
			b = tmp;
		}else {
			//큰값과 작은값 구분하여 저장
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
// 세가지 수의 최소 공배수 구하기 시도했던 부분.
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
//		//최소공배수(LCM) 출력
//		System.out.println(lcm);
//	}
//	public Integer getGCF(Integer a, Integer b) {
//		Integer bn = 0;
//		Integer sn = 0;
//		Integer tmp = 0;
//		Integer n = 2;
//		if(a < b) {
//			//큰값과 작은값 구분하여 저장
//			bn = b;
//			sn = a;
//			
//			//대소 구분하여 저장 후 a,b의 값을 바꿔놓는다(아래 while문에서 %연산시 a가 큰 숫자이어야 하므로.)
//			tmp = a;
//			a = b;
//			b = tmp;
//		}else {
//			//큰값과 작은값 구분하여 저장
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
