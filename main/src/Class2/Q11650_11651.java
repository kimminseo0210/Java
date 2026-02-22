package Class2;
import java.util.*;
import java.io.*;
public class Q11650_11651 /* 좌표 정렬하기 */ {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 11650
        Arrays.sort(arr,(x1,x2) -> {
            if (x1[0] == x2[0]) { // 만약 x 좌표가 같다면
                return x1[1] - x2[1];  // y 좌표 비교
            }
            return x1[0] - x2[0]; // 아니면 x 좌표 정렬
        });
        // 11651
        Arrays.sort(arr,(x1,x2) -> {
            if (x1[1] == x2[1]) { // 만약 x 좌표가 같다면
                return x1[0] - x2[0];  // y 좌표 비교
            }
            return x1[1] - x2[1]; // 아니면 x 좌표 정렬
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        System.out.println(sb);


    }
}
