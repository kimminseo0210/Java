package Class2;

import java.io.*;
import java.util.*;

public class Q30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 참가자 n, 사이즈 6개(S~3XL), 묶음수 T(티),P(펜)
        // 스캐너와 버퍼리더를 같이쓰면 NullPointer 에러가 난다
        int n = Integer.parseInt(br.readLine());
        int[] sizeArr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<6; i++) sizeArr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        // 티
        int count = 0; // 티 묶음 수
        for (int val : sizeArr) {
            count += val/t;
            if (val%t != 0) count++;    // 이것도 틀린 계산식은 아님
            // (val + t - 1) / t 수식을 이용하여 하나의 줄로 코드를 작성 할 수 있음 (코드 최적화)
        }
        for (int val : sizeArr) count += (val+t-1)/t;
        System.out.println(count);
        System.out.println(n/p+" "+n%p); // 펜 (묶음 + 개별)
    }
}
