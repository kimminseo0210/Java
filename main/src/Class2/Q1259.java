package Class2;

import java.io.*;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            String reverseStr = new StringBuilder(str).reverse().toString();
            // 삼항 연산자를 이용하여 결과값을 바로 저장
            String result = str.equals(reverseStr) ? "yes" : "no";
            System.out.println(result);
        }
    }
}
