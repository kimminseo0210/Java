package Class2;

import java.util.*;
import java.io.*;

public class Q1181 /* 단어 정렬 */{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 개수 : n
        int n = Integer.parseInt(br.readLine());
        // 단어를 입력 할 배열 크기(n)
        String[] str = new String[n];
        // 입력
        for (int i=0; i<n; i++) {
            str[i] = br.readLine();
        }
        // 람다식 복습
        Arrays.sort(str , (s1, s2) -> {
           // 단어 길이가 같다면 (사전순 : 기본내장함수)
           if (s1.length() == s2.length()) return s1.compareTo(s2);
           // 다르면 (짧은 순)
           return s1.length() - s2.length();
        });
        // 단어 중복 확인
        // 시간초과 방지 StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append('\n');
        for (int i=1; i<str.length; i++) {
            if (!str[i].equals(str[i-1])) sb.append(str[i]).append('\n');
        }
        System.out.println(sb);
    }
}
