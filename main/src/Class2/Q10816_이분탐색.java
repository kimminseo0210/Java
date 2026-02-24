package Class2;

import java.io.*;
import java.util.*;

public class Q10816_이분탐색 /* 숫자 카드 2 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) arrN[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrN); // {-10,-10,2,3,3,6,7,10,10,10}

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m]; // {0,0,0,0,0,0,0,0}
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) arrM[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<m; i++) {
            sb.append(upperBound(arrN, arrM[i])-lowerBound(arrN, arrM[i])).append(' ');
        }
        System.out.println(sb);
    }
    static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
