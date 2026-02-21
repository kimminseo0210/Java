package Class2;

import java.util.*;
import java.io.*;

public class Q11050 {
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //   이항계수 : n개에서 순서 없이 r개를 선택하는 조합의 수
        // (n k) = n! / r!(n-r)!
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int binomialCoefficient = 0;
        binomialCoefficient = factorial(n) / (factorial(k)*factorial(n-k));
        System.out.println(binomialCoefficient);
    }
}
