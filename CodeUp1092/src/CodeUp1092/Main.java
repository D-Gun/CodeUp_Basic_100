package CodeUp1092;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sS = s.split(" ");
		Integer[] a = new Integer[sS.length];
		Main m = new Main();
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sS[i]);
		}
		m.solution(a);
	}
	
	public void solution(Integer[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
		Integer gcf = 0;
		Integer lcm = 0;
		//gcf
		gcf = getGCF(getGCF(arr[0],arr[1]),arr[2]);
		System.out.println(gcf);
		lcm = (arr[0]*arr[1]*arr[2]) / gcf;
		
		//최소공배수(LCM) 출력
		System.out.println(lcm);
	}
	public Integer getGCF(Integer a, Integer b) {
		//swap으로 위치정리
		if(a < b) {
			Integer tmp = 0;
			tmp = a;
			a = b;
			b = tmp;
		}
		while (b != 0) {
			Integer n = a % b;
			a = b;
			b = n;
		}
		return a;
	}
}
