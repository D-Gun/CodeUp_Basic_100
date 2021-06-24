package CodeUp1094;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		int si3 = Integer.parseInt(s1); // 부를 숫자의 개수 저장
		String[] p = s2.split(" ");
		Integer[] a = new Integer[si3]; // 불려진 숫자를 저장하는 배열
		for (int i = 0; i < si3; i++) {
			a[i] = Integer.parseInt(p[i]);
		}
		for (int j = a.length-1 ; j > -1; j--) {
			System.out.printf("%d ",a[j]);
		}
	}
}
