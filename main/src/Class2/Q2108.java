package Class2;

import java.util.*;
import java.io.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int arrlen = (int) (Math.floor((double) arr.length / 2));
        int sum = 0;
        int[] countNumber = new int[8001];


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[i] = number;
            sum += arr[i];
            countNumber[number+4000]++;
        }
        // 산술평군
        sb.append(Math.round((double) sum / n)).append('\n');
        // 중앙 값
        Arrays.sort(arr);
        sb.append(arr[arrlen]).append('\n');

        // 최빈값
        int maxFreq = 0; // 최대 등장 횟수
        int modeResult = 0; // 두 번째 큰 수

        for (int i=0; i<8001; i++) {
            if (countNumber[i] > maxFreq) maxFreq = countNumber[i];
        }
        boolean flag = false;
        for (int i=0; i<8001; i++) {
            if (countNumber[i] == maxFreq) {
                if (!flag) {
                    modeResult = i - 4000;
                    flag = true;
                } else {
                    modeResult = i - 4000;
                    break;
                }
            }
        }
        sb.append(modeResult).append('\n');

        // 범위
        sb.append(arr[n - 1] - arr[0]).append('\n');

        System.out.println(sb);
    }
}
