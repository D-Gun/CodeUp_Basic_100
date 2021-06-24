package CodeUp1082;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		char a = s.charAt(0);
		char b =' ';
		int c = (int)a;
		if (c >= 65 && c <= 70) {
			switch (c) {
			case 65:
				c = 10;
				break;
			case 66:
				c = 11;
				break;
			case 67:
				c = 12;
				break;
			case 68:
				c = 13;
				break;
			case 69:
				c = 14;
				break;
			case 70:
				c = 15;
				break;
			default:
				break;
			}
		}
		int result = 0;
		
		for (int i = 1; i < 16; i++) {
			result  = c * i;
			if (i >= 10 && i < 16 ) {
				switch (i) {
				case 10:
					b = 'A';
					break;
				case 11:
					b = 'B';
					break;
				case 12:
					b = 'C';
					break;
				case 13:
					b = 'D';
					break;
				case 14:
					b = 'E';
					break;
				case 15:
					b = 'F';
					break;

				default:
					break;
				}
			} else {
				b = Character.forDigit(i, 10); //10진법 숫자 char형으로 변환
			}
			System.out.printf("%c*%c=%X\n",a,b,result);
		}
	}
}
