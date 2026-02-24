package Class2;

import java.util.*;
import java.io.*;

public class Q1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j=i*i; j<prime.length; j += i) {
                prime[j] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=m; i<=n; i++) {
            if (!prime[i]) sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
/** 출력 시간
 * for문 출력 664ms
 * StringBuilder를 이용한 출력 208ms
 */
/** 시간복잡도
 *  2중 for 문
 *  입력 최대 :1 <= m <= n <= 1,000,000
 *  O(N log(log N))
 *
 *  최적화 방법
 *  for문으로 출력을 하고있어 추후 I/O병목 가능
 *  StringBuilder로 해결
 */