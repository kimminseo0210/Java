package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 해시멥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // n : 입력 받을 주소 개수 / m : 비번을 찾을 주소 개수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 입력
        HashMap<String, String> map = new HashMap<>(n);
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            int spaceIndex = line.indexOf(' ');
            map.put(line.substring(0, spaceIndex), line.substring(spaceIndex+1));
        }
        // 검색
        for (int i=0; i<m; i++) {
            sb.append(map.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
