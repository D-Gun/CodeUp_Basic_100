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
			
			
			
//			//���ڿ� ������
//			for (int k = 0; k < (number.length)/2; k++) {
//				tmp = c[k];
//				c[k] = c[number.length-k-1];
//				c[number.length-k-1] = tmp;
//			}
			
			//������ ���ڿ� Integer������ ��ȯ
			for (int j = 0; j < c.length; j++) {
				number[j] = Character.getNumericValue(c[j]);
				System.out.print(number[j]);
			}
			//Integer �迭 List�� ��ȯ
			List<Integer> numOfList = Arrays.asList(number);
			Collections.reverse(numOfList);
			
//			Arrays.sort(number,Collections.reverseOrder());
			//�� ������ ������������ �����ϰ� �ǹǷ� �ùٸ��� �ʴ�.
			
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
