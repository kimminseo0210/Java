package Class2;

import java.io.*;
import java.util.*;

public class Q2164_내장큐사용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /** 규칙 (카드 4 개 기정)
         *  1. 제일 위에 있는 카드 버림
         *  2. 그 다음 위에 있는 카드를 제일 밑으로 내림
         *  이걸 반복
         *  1234 (1 버림) -> 234 (2 내림) -> 342 (3 버림)
         *  -> 42 (4 내림) -> 24 (2 버림) -> 4
         */
        int n = Integer.parseInt(br.readLine());

        // 큐 객체 생성 (LinkedList를 이용해 파이프 생성)
        Queue<Integer> q = new LinkedList<>();

        // 1부터 n까지 큐에 차례로 넣기
        for (int i=1; i<=n; i++) {
            q.add(i);
        }

        // 카드가 딱 1장 남을 때까지 반복 (size)
        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}
