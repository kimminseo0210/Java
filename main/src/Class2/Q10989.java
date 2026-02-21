package Class2;

import java.util.*;
import java.io.*;

public class Q10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[10001]; // 범위가 10,000이므로 10001 배열 생성
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            numArr[num]++;  // 해당 숫자가 들어오면 +1
        }
        StringBuilder sb = new StringBuilder(); // for문으로 출력하면 시간오류로 StringBuilder로 조립하여 한번에 출력
        for (int i=0; i<10001; i++) {
            while (numArr[i] > 0) { // if문으로 하면 하나씩만 출력을 하므로 while문으로 해당 숫자가 0이 될때까지 sb에 조립
                sb.append(i).append("\n");
                numArr[i]--;
            }
        }
        System.out.println(sb);
    }
}
