package Class2;
import java.util.*;
import java.io.*;
public class Q10814 /* 나이순 정렬 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 기존 코드 (528ms)
//        String[][] str = new String[n][2];
//
//        for (int i=0; i<n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            str[i][0] = st.nextToken();
//            str[i][1] = st.nextToken();
//        }
//        Arrays.sort(str, (s1, s2) -> {
//            return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
//        });
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i<n; i++) sb.append(str[i][0]).append(' ').append(str[i][1]).append('\n');
//        System.out.println(sb);
        // 최적화 코드 (344ms)
        StringBuilder[] ageBoxes = new StringBuilder[201];
        for (int i=1; i<=200; i++) ageBoxes[i] = new StringBuilder();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            ageBoxes[age].append(age).append(" ").append(name).append('\n');
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=200; i++) sb.append(ageBoxes[i]);
        System.out.println(sb);
    }
}
