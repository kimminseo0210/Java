package Class2;

import java.io.*;
import java.util.*;

public class Q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==0 && b==0 && c==0) break;
            long A = a*a;
            long B = b*b;
            long C = c*c;
            String result = ((A+B==C)||(A+C==B)||(B+C==A)) ? "right" : "wrong";
            System.out.println(result);
        }
    }
}
