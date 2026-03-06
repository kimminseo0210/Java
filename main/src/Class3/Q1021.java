package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/** 덱
 * 규칙1 : pollFirst로 숫자 추출
 * 규칙2 : 왼쪽 시프트 후 뽑은 수를 addLast
 * 규칙3 : 오른쪽 끝(pollLast)후 시프트 다시 addFirst
 */

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n : 덱의 크기  /  m : 찾으려는 숫자의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 양방향 큐 -> 덱 생성
        Deque<Integer> deque = new ArrayDeque<>(n);

        // 덱 채우기
        for (int i=1; i<=n; i++) {
            deque.addLast(i);
        }

        // 찾을 숫자의 위치
        st = new StringTokenizer(br.readLine());
        int[] target = new int[m];
        for (int i=0; i<m; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 연산 값 저장
        int count = 0;

        // 알고리즘 시작
        for (int i=0; i<m; i++) {
            // 찾을 숫자
            int targetIndex = 0;
            for (int num : deque) {
                if (num == target[i]) break;
                targetIndex++;
            }

            // 덱 사이즈 반 뚝(중간 기준점 찾기)
            int halfIndex = deque.size()/2;
            // 타겟이 앞쪽에 있을 때
            if (targetIndex <= halfIndex ) {
                while (deque.peekFirst() != target[i]) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else { // 타겟이 뒷쪽에 있을 때
                while (deque.peekFirst() != target[i]) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}