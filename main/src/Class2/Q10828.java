package Class2;

import java.util.*;
import java.io.*;

public class Q10828 /* 스택 */  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if (str.equals("pop")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append('\n');
                    stack.pop();
                }
                else sb.append("-1"+'\n');
            }
            else if (str.equals("size")) sb.append(stack.size()).append('\n');
            else if (str.equals("empty")) sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            else if (str.equals("top")) sb.append(!stack.isEmpty() ? stack.peek() : -1).append('\n');
        }
        System.out.println(sb);
    }
}
