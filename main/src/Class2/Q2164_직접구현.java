package Class2;

import java.io.*;
import java.util.ArrayList;

public class Q2164_직접구현 /*  */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /** 규칙 (카드 4 개 기정)
         *  1. 제일 위에 있는 카드 버림
         *  2. 그 다음 위에 있는 카드를 제일 밑으로 내림
         *  이걸 반복
         *  1234 (1 버림) -> 234 (2 내림) -> 342 (3 버림)
         *  -> 42 (4 내림) -> 24 (2 버림) -> 4
         */

        // 카드의 개수 n
        int n = Integer.parseInt(br.readLine());
        // 카드가 최대 n장, 뒤로 n-1장이 계속 추가되므로 넉넉하게 2배
        int[] q = new int[n*2+1];
        ArrayList<Integer> list = new ArrayList<>();

        // 카드를 1~n 까지 차례로 넣음
        for (int i=1; i<=n; i++) {
            q[i] = i;
        }
        // 포인터 초기 세팅
        int left = 1;
        int right = n+1;
        // 카드가 딱 한 장 남을 때까지 반복
        while (right - left > 1) {
            // 규칙1 : 제일 위에 있는 카드 버림
            left++;
            // 규칙 2 : 그 다음 카드를 제일 밑으로
            q[right] = q[left];
            // 카드를 뒤로 넣었으니 빈칸 위치를 한칸 뒤로 밀고
            // 뽑은 기존 카드 위치도 한칸 버림
            right++;
            left++;
        }
        System.out.println(q[left]);
    }
}
