package Class2;

import java.io.*;
import java.util.Stack;

public class Q9012 /* 괄호 (스택) */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 수
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();
            Boolean flag = true;

            for (int j=0; j<line.length(); j++) {
                char c = line.charAt(j); // 문자 하나씩 분해
                if (c=='(') {
                    stack.push(c);
                }
                else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    } else stack.pop();
                }
            }
            sb.append((flag && stack.isEmpty()) ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }
}
