package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스
        int testCase = Integer.parseInt(br.readLine());

        // 최대 40개 이니 41짜리 배열 생성
        int[] zero = new int[41];
        int[] one = new int[41];

        // n=0 일때 초기 세팅
        zero[0] = 1;
        one[0] = 0;
        // n=1 일때 초기 세팅
        zero[1] = 0;
        one[1] = 1;
        // 미리 배열을 통해 정답을 세팅
        for (int i=2; i<=40; i++) {
            zero[i] = zero[i-2] + zero[i-1];
            one[i] = one[i-2] + one[i-1];
        }

        StringBuilder sb = new StringBuilder();
        // 각 테스트케이스의 숫자에 맞는 값을 출력하면 끝
        for (int i=0; i<testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(zero[n]).append(" ").append(one[n]).append("\n");
        }
        System.out.println(sb);
    }
}