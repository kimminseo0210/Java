package Class2;

import java.io.*;
import java.util.*;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 방법 1 (stack 200ms)
        Stack<Integer> stack = new Stack<>();
        int numsum1 = 0;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                numsum1 -= stack.peek();
                stack.pop();
            } else {
                numsum1 += num;
                stack.push(num);
            }
        }
        System.out.println(numsum1);

        // 방법 2 (arr 180ms)
        int[] arr = new int[n];
        int top = 0;
        int numsum2 = 0;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[top] = num;
            if (num == 0) {
                top--;
                numsum2 -= arr[top];
            }
            else {
                numsum2 += num;
                top++;
            }
        }
        System.out.println(numsum2);
    }
}
