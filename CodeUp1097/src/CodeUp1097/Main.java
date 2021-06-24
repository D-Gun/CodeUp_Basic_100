package CodeUp1097;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][] board = new int[19][19]; //바둑판 배열 선언
		
		//현재 바둑판 상태 저장하기
		for (int a = 0; a < board.length; a++) {
			//String값 초기화
			String s1 = "";
			String[] in = null;			
			
			s1 = bf.readLine();
			in = s1.split(" ");
			
			// 한줄 숫자로 변환
			int[] r = new int[19]; 
			for (int b = 0; b < r.length; b++) {
				r[b] = Integer.parseInt(in[b]); 
			}
			
			//바독판 배열에 입력값 저장
			if (a < 19) {
				for (int j = 0; j < 19; j++) {
					board[a][j] = r[j];
				}
			}
		}
		
		//입력받은 좌표의 십자 뒤집기(좌표값 입력 받을 떄마다 뒤집기 실행, 좌표개수만큼 반복)
		//좌표값 개수 입력
		String s2 = bf.readLine();		
		int n = Integer.parseInt(s2);
		
		//뒤집기 실행
		for (int h = 0; h < n; h++) { //좌표 개수만큼 실행
			
			//좌표값 입력받기 (s4[0] = x좌표, s4[1] = y좌표)
			String s3 = bf.readLine();
			String[] s4 = s3.split(" ");
			int s4x = Integer.parseInt(s4[0]);
			int s4y = Integer.parseInt(s4[1]);
			
			for (int x = 0; x < board.length; x++) {//가로축 뒤집기
				if (board[x][s4y-1] == 0) {
					board[x][s4y-1] = 1;
				} else {
					board[x][s4y-1] = 0;
				}
			}
			for (int y = 0; y < board.length; y++) {//세로축 뒤집기
				if (board[s4x-1][y] == 0) {
					board[s4x-1][y] = 1;
				} else {
					board[s4x-1][y] = 0;
				}
			}
		}
		
		//결과 출력
		for (int e = 0; e < board.length; e++) {
			for (int f = 0; f < board.length; f++) {
				System.out.printf("%d ",board[e][f]);
			}
			System.out.println();
		}
	}
}
