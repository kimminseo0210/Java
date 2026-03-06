package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 해시셋 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        // 듣도 n / 보도 m
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> setPeople = new HashSet<>(n);
        for (int i=0; i<n; i++) {
            setPeople.add(br.readLine());
        }

        for (int i=0; i<m; i++) {
            String seePerson = br.readLine();
            if (setPeople.contains(seePerson)) list.add(seePerson);
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(list);
        sb.append(list.size()).append('\n');

        for (String s : list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
