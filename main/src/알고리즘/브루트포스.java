package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 클래스 2 브루트포스의 수문장 격 문제
 * 경계선 설정(n-8, m-8)부터 (k+l)%2 같은 수학적 패턴까지 섞여있는 문제
 */
public class 브루트포스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] chessBoard = new String[n];

        for (int i = 0; i < n; i++) {
            chessBoard[i] = br.readLine();
        }

        int min = 64; // 보드는 8x8 = 64

        // 8x8 체스판 검사
        for (int i = 0; i <= n-8; i++) { // 세로
            for (int j = 0; j <= m-8; j++) { // 가로
                // 뽑아낸 8x8 체스판 안에서 탐색
                int count = 0;

                for (int k = i; k < i+8; k++) {
                    for (int l = j; l < j+8; l++) {
                        if ((k+l)%2 == 0) {
                            if (chessBoard[k].charAt(l) != 'W') count++;
                        } else {
                            if (chessBoard[k].charAt(l) != 'B') count++;
                        }
                    }
                }
                int currenMin = Math.min(count, 64-count);
                min = Math.min(min, currenMin);
            }
        }
        System.out.println(min);
    }
}
