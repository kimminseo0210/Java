package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 /* 큐 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                last = num;
                queue.add(num);
            }
            else if (str.equals("pop")) {
                sb.append(!queue.isEmpty() ? queue.poll() : "-1").append('\n');
            }
            else if (str.equals("size")) {
                sb.append(queue.size()).append('\n');
            }
            else if (str.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append('\n');
            }
            else if (str.equals("front")) {
                sb.append(queue.isEmpty() ? "-1" : queue.peek()).append('\n');
            }
            else if (str.equals("back")) {
                sb.append(queue.isEmpty() ? "-1" :last).append('\n');
            }
        }
        System.out.println(sb);
    }
}
