package Class2;

import java.io.*;
import java.util.*;

public class Q15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = 31;
        int mod = 1234567891;

        // mod 값에 pow(약 10억이라고 가정)곱하면 310억이 됨
        // int에 담기엔 너무 작은 그릇으로 long으로 변환 -> 100점
        long hashResult = 0;
        long pow = 1;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i=0; i<n; i++) {
            int num = str.charAt(i)-'a'+1;
            // 공식 (문자값 * 31^i) % M
            hashResult += (num * pow) % mod;
            hashResult %= mod;
            pow = (pow * r) % mod;
        }
        System.out.println(hashResult);
    }
}
