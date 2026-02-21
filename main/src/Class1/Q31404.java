package Class1;

import java.io.*;
import java.util.*;

public class Q31404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String s = "";	// 빈문자열 생성
        // s += (char)a의 의미 a의 아스키코드 값을 가져와서 더해라
        s += a;	// ""에 a가 자동형변환이 되어 문자로 취급되 더해짐 -> "3"
        s += b;	// "3"에 b가 자동형변환이 되어 문자로 취급되 더해짐 -> "34"

        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(s)-c);
    }
}
