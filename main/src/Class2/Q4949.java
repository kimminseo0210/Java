package Class2;

import java.util.*;
import java.io.*;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (line.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            Boolean isBalanced = true;

            // 문장을 한 글짜씩 뜯어서 검사
            for (int i=0; i<line.length(); i++) {
                char c = line.charAt(i);

                // 열어주는 괄호는 무조건 스택에 삽입
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c ==')') { // 소괄호 판별
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false; //
                        break;
                    } else stack.pop(); // 아니라면 그대로 스택에서 제거
                }
                else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else stack.pop();
                }
            }
            if (isBalanced && stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
