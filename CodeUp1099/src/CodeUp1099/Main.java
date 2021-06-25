package CodeUp1099;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		//박스 생성(한줄씩 입력받아 저장하기)
		int[][] box = new int[10][10];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < box.length; i++) {
			String s1 = bf.readLine();
			String[] boxLine = s1.split(" ");
			for (int j = 0; j < boxLine.length; j++) {
				box[i][j] = Integer.parseInt(boxLine[j]);
			}
		}	
		
		int breaker = 0;
		//개미 경로 표시하기
		for (int a = 1; a < box.length - 1; a++) { // 벽에 해당하는 좌포는 처음부터 제외
			for (int b = 1; b < box.length - 1; b++) {
				if (box[1][1] == 2) { //먹이가 시작점에 있을 떄
					box[a][b] = 9;
					breaker = 99;
					break;
				} else if (box[1][1] == 0) {
					box[a][b] = 9;
				}
				if (box[a][b] == 9 && (box[a][b + 1] == 0 || box[a][b + 1] == 2)) { //경로상에 있을때
					if (box[a][b + 1] != 2) { // 먹이가 아니면
						box[a][b + 1] = 9; // 오른쪽으로 ㄱ
					} else if (box[a][b + 1] == 2) { // 먹이면
						box[a][b + 1] = 9;
						breaker = 99;
						break; // 먹고 ㅅㄱㄹ
					}
				} else if (box[a][b] == 9 && box[a][b + 1] == 1 && (box[a + 1][b] == 0 || box[a + 1][b] == 2)) { //오른쪽 벽을 만났을때
					if (box[a + 1][b] != 2) { // 먹이가 아니면
						box[a + 1][b] = 9; // 아래로 ㄱ
					} else if (box[a + 1][b] == 2) { // 먹이면
						box[a + 1][b] = 9;
						breaker = 99;
						break; // 먹고 ㅅㄱㄹ
					} 
				} else if (box[a][b + 1] == 1 && box[a + 1][b] == 1) { // 아래, 오른쪽이 벽일때
					breaker = 99;
					break; // 막힘 ㅅㄱㄹ
				}
			}
			if (breaker == 99) {
				break;
			}else {
				continue;
			}
		}
		
		//결과값 출력
		for (int c = 0; c < box.length; c++) {
			for (int d = 0; d < box.length; d++) {
				System.out.printf("%d ",box[c][d]);
			}
			System.out.println();
		}
	}
}
