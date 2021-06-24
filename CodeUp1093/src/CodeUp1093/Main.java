package CodeUp1093;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		int si3 = Integer.parseInt(s1); // 부를 숫자의 개수 저장
		String[] p = s2.split(" ");
		Integer[] a = new Integer[si3]; // 불려진 숫자를 저장하는 배열
		Integer[] b = new Integer[23]; // 1~23 까지의 배열
		Arrays.fill(b, 0);
		for (int i = 0; i < si3; i++) {
			a[i] = Integer.parseInt(p[i]);
		}
		//숫자의 불려진 횟수를 23개짜리 배열에 저장(배열의 0~22까지 인덱스를 1부터 23까지라 가정)
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
