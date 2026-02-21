package Class1;

import java.util.*;
import java.io.*;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 숫자 개수
        // N 개의 정수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 최대 최소 -1,000,000~1,000,000
        // 또는 첫 번째 값으로 초기화
        int max = -1000001;
        int min = 1000001;

        for (int i=0; i<n; i++) {
            int now = Integer.parseInt(st.nextToken());
            // [실습 포인트] 삼항 연산자 사용
            max = (now > max) ? now : max;
            min = (now < min) ? now : min;
        }
        System.out.println(min + " " + max);
    }
}
