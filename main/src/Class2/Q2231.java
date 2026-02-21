package Class2;

import java.util.*;
import java.io.*;

public class Q2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int start = n-(String.valueOf(n).length()*9); // 시작점이 1이 아닌 각 자릿수 최솟값(3자리:9*3=27)
        if (start < 0) start = 0; // n이 작을 때 음수가 되는 것 방지(0인 이유: 음수만 아니면 됨)
        // "자연수"라고 했으므로 1로 초기화해도 문제 없음
        // 1. 1부터 n까지 하나씩 검사(가장 작은 수 : 1부터 시작)
        for (int i = start; i < n; i++) {
            int number = i;
            int sum = 0;
            // 2. 각 자릿수 다 더하기
            while (number != 0) {
                sum += number % 10; // 마지막 자릿수 추출
                number = number / 10;   // 마지막 자릿수 제거
            }
            // 3. (원래 숫자 + 자릿수 합)이 n과 같은지 확인
            if (sum + i == n) {
                result = i;
                break;  // 가장 작은 생성자를 찾으면 바로 종료
            }
        }
        System.out.println(result);
    }
}
