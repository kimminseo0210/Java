package Class2;

import java.util.*;
import java.io.*;

public class Q2609 {
    static int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 이후 LCM을 구하기 위해 원래 값 복사 (중요)
        int a = Math.max(n, m); // 큰 수
        int b = Math.min(n, m); // 작은 수
        // 반복문이 끝나면 a가 GCD
        int gcd = GCD(a,b);
        // LCM 구하기 : (원 수자 두 개 곱) / GCD
        int lcm = (n*m)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
