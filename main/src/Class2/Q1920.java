package Class2;

import java.io.*;
import java.util.*;

public class Q1920 /* 수 찾기(이분 탐색) */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);   // 이분 탐색의 필수조건 정렬

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            sb.append(binarySearch(arr, target) ? 1 : 0).append('\n');
        }
        System.out.println(sb);
    }
    static boolean binarySearch(int[] arr, int target) {
        int left = 0;                   // 탐색 범위의 맨 왼쪽 끝
        int right = arr.length - 1;     // 탐색 범위의 맨 오른쪽 끝

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
