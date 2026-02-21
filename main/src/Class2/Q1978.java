package Class2;

import java.util.*;
import java.io.*;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 숫자의 개수 입력
        int[] arr = new int[n];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val==1) continue;
            boolean isPrime = true; // 일단 소수라고 가정
            for (int j=2; j<val; j++) {
                if (val%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++; // = (isPrime == true)와 같은 뜻으로 생략함
        }
        System.out.println(count);
    }
}
