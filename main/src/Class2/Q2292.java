package Class2;

import java.util.*;
import java.io.*;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 방 번호
        // 1 -(+1/+6)-> 2~7(2F) -(+6/+12)-> 8~19(3F) -(+12/+18)-> 20~37(4F) -(+18/+24)->38
        int floor = 1;
        int current_floor = 1;
        while (n>current_floor) {       // 방 번호가 current_floor보다 클 때 까지
            current_floor += 6*floor;   // 층의 마지막번호 업데이트
            floor++;                    // 층 +1
        }
        System.out.println(floor);
    }
}
