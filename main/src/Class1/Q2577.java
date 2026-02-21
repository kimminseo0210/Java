package Class1;

import java.util.*;
import java.io.*;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

//        방법 1
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];
        String num = String.valueOf(a*b*c);

        for (int i=0; i<10; i++) {
            int count = 0;
            for (int j=0; j<num.length(); j++) {
                if (num.charAt(j)-'0' == i) count++;
            }
            System.out.println(count);
        }
//         방법 2
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        String number = String.valueOf(x*y*z);
        for (int i=0; i<10; i++) {
            int count = 0;
            for (int j=0; j<number.length(); j++) {
                if (number.charAt(j)-'0' == i) count++;
            }
            System.out.println(count);
        }
    }
}
