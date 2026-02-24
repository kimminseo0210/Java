package Class2;

import java.util.*;
import java.io.*;

public class Q1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;

        for (int i=m; i<=n; i++) {
            if (!seieveOfEratosthenes(i)) System.out.println(i);
        }

    }
    static boolean seieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n+1];

        prime[0] = false;
        prime[1] = false;

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j=i*i; j<prime.length; j += i) {
                prime[j] = true;
            }
        }
        return prime[n];
    }
}
