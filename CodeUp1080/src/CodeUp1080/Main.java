package CodeUp1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			int target = Integer.parseInt(s);
			int flag = 0;
			int sum = 0;
			while(true) {
				sum += flag;
				if(sum >= target) {
					System.out.println(flag);
					break;
				} else {
					flag++;
				}				
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
