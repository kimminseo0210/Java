package Class2;

import java.util.*;
import java.io.*;

public class Q2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 카드의 개수
        int m = Integer.parseInt(st.nextToken());   // 최대값

        st = new StringTokenizer(br.readLine()); // 재할당 :
        int[] numArr = new int[n];

        // !*!*핵심*!*!
        for (int i=0; i<n; i++) {
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;        // 최대값 저장
        int totalSum = 0;   // 근사치 저장
        for (int i=0; i<=n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++ ) {
                    sum = numArr[i] + numArr[j] + numArr[k]; // 3수 더하기
                    if (sum == m) {
                        System.out.println(sum);
                        return; // return(함수(프로그램)종료) break(반복문 하나 탈출)
                    }
                    if (sum > totalSum && sum <= m) totalSum = sum;
                }
            }
        }
        System.out.println(totalSum);
    }
}
