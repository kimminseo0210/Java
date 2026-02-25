package Class2;

import java.util.*;
import java.io.*;

public class Q1874_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 1;
        boolean flag = true;

        for (int i=1; i<=n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (start <= target) {
                stack.push(start);
                sb.append("+").append('\n');
                start++;
            }
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-").append('\n');
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? sb : "NO");
    }
}
