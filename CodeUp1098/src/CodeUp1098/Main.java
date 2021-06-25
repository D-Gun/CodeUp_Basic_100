package CodeUp1098;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//격자판 크기 입력
		String s1 = bf.readLine();
		String[] boardSize = s1.split(" ");
		int w = Integer.parseInt(boardSize[0]);
		int h = Integer.parseInt(boardSize[1]);
		int[][] board = new int[w][h];
		for (int e = 0; e < w; e++) {
			Arrays.fill(board[e], 0); //격자판 0으로 입력
		}
		
		//막대의 갯수 입력
		String s2 = bf.readLine();
		int numOfStick = Integer.parseInt(s2);
				
		//길이, 방향, 좌표 입력받고, 막대 놓기
		for (int rotate = 0; rotate < numOfStick; rotate++) {
			String s3 = bf.readLine();
			//입력받은값 배열로 저장
			//stickInfo[0]: 길이, stickInfo[1]: 방향(0은 가로, 1은 세로), stickInfo[2],stickInfo[3]: xy좌표
			String[] stickInfo = new String[4];
			stickInfo =	s3.split(" ");
			int l = Integer.parseInt(stickInfo[0]);
			int d = Integer.parseInt(stickInfo[1]);
			int x = Integer.parseInt(stickInfo[2])-1;
			int y = Integer.parseInt(stickInfo[3])-1;
			for (int a = 0; a < l; a++) {
				if (d == 0) { //가로축 막대 생성
					board[x][y + a] = 1;
				} else if (d == 1) { //세로축 막대 생성
					board[x + a][y] = 1;
				}
				
			}
		}
		
		//결과값 출력
		for (int c = 0; c < w; c++) {
			for (int d = 0; d < h; d++) {
				System.out.printf("%d ",board[c][d]);
			}
			System.out.println();
		}
	}
}
