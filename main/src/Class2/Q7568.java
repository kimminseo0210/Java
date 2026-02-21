package Class2;
import java.util.*;
import java.io.*;
public class Q7568 /* 덩치 */{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());   // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken());   // 키
        }
        StringBuilder sb = new StringBuilder();
        // 비교 시작
        for (int i=0; i<n; i++) {
            int rank = 1;
            for (int j=0; j<n; j++) {
                if (arr[i] == arr[j]) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] ) rank++;
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
