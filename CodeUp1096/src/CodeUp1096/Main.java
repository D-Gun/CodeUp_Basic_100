package CodeUp1096;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int n = Integer.parseInt(s);
		int[][] location = new int[n][2];
		String[] s1;
		
		// 입력값을 받을 배열 초기화
		for (int[] item : location) {
			Arrays.fill(item, 0);
		}
		//입력좌표 배열에 저장
		for (int x = 0; x < n; x++) {
			String sf = bf.readLine();
			s1 = sf.split(" ");
			for (int y = 0; y < s1.length; y++) {
				location[x][y] = Integer.parseInt(s1[y]);
			}
		}
		
		//19*19 배열 생성
		int[][] board = new int[19][19];
		
		//배열 초기화
		for (int[] item : board) {
			Arrays.fill(item, 0);
		}
		
		//해당 좌표에 1입력
		for (int a = 0; a < n; a++) {
			int b = 0;
			board[location[a][b]-1][location[a][b+1]-1] = 1;
		}
		
		//출력
		for (int c = 0; c < 19; c++) {
			for (int d = 0; d < 19; d++) {
				System.out.printf("%d ",board[c][d]);
			}
			System.out.println();
		}
	}
}
