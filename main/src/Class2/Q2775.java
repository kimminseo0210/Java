package Class2;

import java.io.*;

public class Q2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apt = new int[15][15];  // 0~14층 1~14호 넉넉히 15x15
        for (int i=1; i<15; i++) apt[0][i] = i; // 0층 i호는 i명이 산다
        // 미리 채워놓기
        for (int i=1; i<15; i++) {
            for (int j=1; j<15; j++) {
                // 공식 : 우리집 = 옆집 + 아랫집
                apt[i][j] = apt[i][j-1]+apt[i-1][j];
            }
        }
        int testcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<testcase; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            //System.out.println(apt[k][n]);
            sb.append(apt[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
