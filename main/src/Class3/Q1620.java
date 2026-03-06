package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m =  Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        // 도감 입력
        HashMap<String, Integer> map = new HashMap<>();
        String[] nameArr = new String[m+1];
        // 해시맵은 String->Int 순이라
        // 입력이 숫자가 들어온다면 null 값을 반환하게 됨
        // input : 25 일때의 값이 없으니 null을 반환
        // String[] 을 만들어서 같이 저장(입력이 숫자일때)
        for (int i=1; i<=m; i++) {
            String name = br.readLine();
            map.put(name, i);
            nameArr[i] = name;
        }
        // 도감 검색
        for (int i=0; i<n; i++) {
            // 입력자체를 문자열로 받고 첫 글자가 문자인지 숫자인지 구별
            String key = br.readLine();
            char firstChar = key.charAt(0);
            if (Character.isDigit(firstChar)) {
                int num = Integer.parseInt(key);
                sb.append(nameArr[num]).append('\n');
            } else {
                sb.append(map.get(key)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
