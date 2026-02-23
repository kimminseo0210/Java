package Class2;

import java.io.*;
import java.util.*;

public class Q11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
/**
 * 제거된 위치부터 3번째
 * 1 2 3 4 5 6 7
 * 1 2 4 5 6 7 / 3
 * 1 2 4 5 7 / 3 6
 * 1 4 5 7 / 3 6 2
 * 1 4 5 / 3 6 2 7
 * 1 4 / 3 6 2 7 5
 * 4 / 3 6 2 7 5 1
 * / 3 6 2 7 5 1 4
 */
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=n; i++) {
            queue.add(i);
        }
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i=0; i<k-1; i++) {
                queue.add(queue.poll());
            }
            int target = queue.poll();
            sb.append(target);
            if (queue.isEmpty()) sb.append(">");
            else sb.append(", ");
        }
        System.out.println(sb);
    }
}
