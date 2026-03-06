package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비트마스킹 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        int S = 0;

        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            // 뒤에 숫자(x)가 없는거 먼저 처리
            if (command.equals("all")) {
                /* x는 20까지 이므로 1~20번까지 두 켜져야함
                 * 21번 비트를 키고 -1을 하면 20번까지 모두 켜짐
                 * 1000 - 1 = 0111 되듯
                 * 1 0000 0000 0000 0000 0000 - 1
                 * = 0 1111 1111 1111 1111 1111
                 */
                S = (1 << 21) - 1;
                continue;
            } else if (command.equals("empty")) {
                // 모든 스위치 끄는 건 그냥 0 대입
                S = 0;
                continue;
            }

            // 이제 숫자(x) 처리
            int x = Integer.parseInt(st.nextToken());

            switch (command) {
                case "add" :
                    // OR(|) 연산자 활용
                    // 원래 상태와 상관없이, x번째 비트를 강제로 1로
                    S = S | (1 << x);
                    break;
                case "remove" :
                    // AND(&) NOT(~) 연산자 콤보
                    // ~ (1 << x)는 x번째 자리만 0이고, 나머지는 1
                    // S & 을 하여 다른 자리는 원상태를 유지하면서, x만 0
                    S = S & ~ (1 << x);
                    break;
                case "check" :
                    // AND 사용
                    // S의 x번째가 1이라면 (1 << x)와 겹칠때 0이 아닌 값이 튀어나옴
                    // 만약 0이면 0이 나옴
                    sb.append(((S & (1 << x)) != 0) ? "1\n" : "0\n");
                    break;
                case "toggle" :
                    // XOR(^) 연산자 활용
                    // 원래 S의 x번째 자리가 1이면 0으로, 0이면 1로 뒤집어
                    S = S ^ (1 << x);
                    break;
            }
        }
        System.out.println(sb);
    }
}
