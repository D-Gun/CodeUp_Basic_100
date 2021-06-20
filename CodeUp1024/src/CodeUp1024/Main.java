package CodeUp1024;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			char[] c = s.toCharArray();
			//char tmp;
			Integer[] number = new Integer[c.length];
			
			
			
//			//문자열 뒤집기
//			for (int k = 0; k < (number.length)/2; k++) {
//				tmp = c[k];
//				c[k] = c[number.length-k-1];
//				c[number.length-k-1] = tmp;
//			}
			
			//뒤집은 문자열 Integer형으로 변환
			for (int j = 0; j < c.length; j++) {
				number[j] = Character.getNumericValue(c[j]);
				System.out.print(number[j]);
			}
			//Integer 배열 List로 변환
			List<Integer> numOfList = Arrays.asList(number);
			Collections.reverse(numOfList);
			
//			Arrays.sort(number,Collections.reverseOrder());
			//위 구문은 내림차순으로 정리하게 되므로 올바르지 않다.
			
			System.out.println("");
			for (int i = c.length-1; i >= 0; i--) {
				int base = 10;
				System.out.println("[" + number[i]*(int)Math.pow(base, i) + "]");
			}
		}
		catch (IOException e) {
			System.out.println("IOException : " + e);
		}
	}
}
