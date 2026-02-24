package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816_해시맵 /* 숫자 카드 2 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 카드의 숫자를 이름표(Key)로, 개수를 내용물(Value)로 저장할 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2. 상근이의 카드를 해시맵에 넣기
        for (int i=0; i<n; i++) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 3. 찾을 카드를 해시맵에서 꺼내기
        for (int i=0; i<m; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(target, 0)).append(' ');
        }
        System.out.println(sb);
    }
}
