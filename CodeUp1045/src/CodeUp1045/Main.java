package CodeUp1045;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sSplit = s.split(" ");
			int[] sSplitToInt = new int[sSplit.length];
			
			for (int i = 0; i < sSplitToInt.length; i++) {
				sSplitToInt[i] = Integer.parseInt(sSplit[i]); 
			}
			int sum = sSplitToInt[0] + sSplitToInt[1];
			int minus = sSplitToInt[0] - sSplitToInt[1];
			int product = sSplitToInt[0] * sSplitToInt[1];
			int devide1 = sSplitToInt[0] / sSplitToInt[1];
			int devide2 = sSplitToInt[0] % sSplitToInt[1];
			double devide3 = ((double)sSplitToInt[0]) / ((double)sSplitToInt[1]);
			
			System.out.println(sum);
			System.out.println(minus);
			System.out.println(product);
			System.out.println(devide1);
			System.out.println(devide2);
			System.out.printf("%.2f",devide3);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
