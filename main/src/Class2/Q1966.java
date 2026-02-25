package Class2;

import java.util.*;
import java.io.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<testCase; i++) {
            // Queue 선언
            Queue<int[]> queue = new LinkedList<>();
            int printCount = 0;

            // 1번 줄 n,target 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int targetIndex = Integer.parseInt(st.nextToken());

            // 2번 줄 문서들 중요도
            st = new StringTokenizer(br.readLine());

            // 큐에 넣기
            for (int j=0; j<n; j++) {
                // 중요도를 쪼개서 인덱스와 같이 저장
                int priority = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j, priority});
            }
            //------ 삽입 끝 -----
            //------ 출력 알고리즘 ------
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean isMax = true;

                for (int[] q : queue) {
                    if (q[1] > current[1]) {
                        isMax = false;
                        break;
                    }
                }
                if (!isMax) {
                    queue.add(current);
                } else {
                    printCount++;
                    if (current[0] == targetIndex) {
                        sb.append(printCount).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb);

    }
}
/** 시간복잡도
 * 핵심로직 while( for() )
 * while : 최악의 경우 n번 반복 O(n)
 * for(내부 int[] q 부분) :
 * 또한 최악의 경우 n번 반복 O(n)
 * 입력 N개 = n * O(n)
 * -> O(n^2)
 * 테스트케이스 T : O(T * n^2)
 */