package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            // 명령어를 쪼개서 배열에 저장
            String command = br.readLine();
            String[] commandArr = new String[command.length()];
            for (int j=0; j<command.length(); j++) {
                commandArr[j] = String.valueOf(command.charAt(j));
            }
            // 배열 사이즈
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>(n);
            // []에서 숫자 추출
            String arrLine = br.readLine();
            // 양 끝 [] 지우기
            String core = arrLine.substring(1, arrLine.length() - 1);
            // core 에서 숫자 떼서 배열에 저장
            for (int j=0; j<n; j++) {
                deque.addLast(Integer.parseInt(core.split(",")[j]));
            }
            // 알고리즘 시작

            if (commandArr.length > deque.size() | deque.isEmpty()) {
                sb.append("error\n");
            }

            boolean isReversed = false;
             for (String s : commandArr) {
                 if (s.equals("R")) {
                     isReversed = !isReversed;
                 }
                 if (s.equals("D")) {
                     deque.removeFirst();
                 }
             }

            sb.append("[");
            while (!deque.isEmpty()) {
                if (isReversed) {
                    // 뒤집힌 상태라면 뒤에서 부터 하나씩 제거
                    sb.append(deque.pollLast());
                } else {
                    // 아니면 앞에서부터 하나씩 제거
                    sb.append(deque.pollFirst());
                }

                // 덱이 비어있지 않다 -> 다음 숫자가 있다 -> , 추가
                if (!deque.isEmpty()) {
                    sb.append(", ");
                }
            }
            sb.append("]").append('\n');
        }
        System.out.println(sb);
    }
}
