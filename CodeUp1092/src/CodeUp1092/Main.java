package CodeUp1092;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] sS = s.split(" ");
		Integer[] a = new Integer[sS.length];
		int day = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sS[i]);
		}
		
		while (day % a[0] != 0 || day % a[1] != 0 || day % a[2] != 0) {
			day++;
		}
		System.out.println(day);
	}
}
