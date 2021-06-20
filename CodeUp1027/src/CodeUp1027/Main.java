package CodeUp1027;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sArray = s.split("\\.");
			int[] sArrayToInt = new int[sArray.length];
			for (int i = 0; i < sArray.length; i++) {
				sArrayToInt[i] = Integer.parseInt(sArray[i]);
			}
			System.out.printf("%02d-%02d-%04d",sArrayToInt[2],sArrayToInt[1],sArrayToInt[0]);
		}
		catch(IOException e) {
			System.out.println("IOException : " + e);
		}
	}
}
