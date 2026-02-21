package Class2;

import java.util.*;
import java.io.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        /**
         * 내가 생각한 공식 :
         * 낮동안 올라갈 거리를 미리 뺌(V-A) -> 남은 거리를 나눠서 날짜 구하기 -> 나머지가 남으면 날짜 ++ (달팽이가 움직이는 실제상황을 그대로 코드로 옮김)
         * (v-a)/(a-b)+1
         * 수학적 공식 : 내가 생각한 공식을 통분함 -> (v-b)/(a-b)
        **/
        // A B V : 낮 밤 높이
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        // 하루동안 올라갈 수 있는 높이
        int dayClimb = a-b;
        // 마지막 날 밤에는 미끄러지지 않으므로
        // 목표 높이(v)에서 밤에 미끄러지는 값(b)를 뺀 값을 하루 이동 거리로 나눔
        int days = (v-b)/dayClimb;
        // 나눠떨어지면 낮에 도착 or 나머지가 있으면 하루+
        if ((v-b)%dayClimb != 0) days++;
        System.out.println(days);
    }
}
