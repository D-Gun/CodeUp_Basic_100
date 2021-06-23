package GCFTest;

import java.io.*;

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
		if (m.getGCF(a[0],a[1]) == 1) {
			System.out.println(a[1]));
		}else {
			System.out.println(m.getGCF(a[0],a[1]));
		}
	}
	public Integer getGCF(Integer a, Integer b) {
		Integer bn = 0;
		Integer sn = 0;
		if(a < b) {
			bn = b;
			sn = a;
		}else {
			
		}
		while (sn != 0) {
			Integer n = bn % sn;
			bn = sn;
			sn = n;
			if (sn == 1) {
				return a;
			}
		}
		return a;
	}

}
