package Class2;

import java.io.*;

/** Q1874번 문제
 * 큐의 오랜동작시간을 원시배열로 만들면서 단축 (코테 꼼수)
 * 큐로 만든 경우 316ms 배열로 한 경우 288ms
 */

public class Q1874_배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int[] stack = new int[n];
        int start = 1;
        int top = -1; // 꼭대기를 가리킬 포인터 (초기 설정 -1)
        boolean flag = true;

        for (int i=1; i<=n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (start <= target) {
                top++; // 포인터 +1
                stack[top] = start++; // stack[top] = start 이후 start +1
                sb.append("+").append(' ');
                // stack[++top] = start++;
            }
            if (top != -1 && stack[top] == target) {
                top--;
                sb.append("-").append(' '); // 결과 보기쉽게 엔터가 아닌 공백으로
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? sb : "NO");
    }
}
