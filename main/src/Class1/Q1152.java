package Class1;

import java.util.*;
import java.io.*;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        // 방법 1
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());

        //   방법 2
        String str = sc.nextLine();
        int cnt = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }
        }
        if (str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ') {
            cnt++;
        }
        if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
            cnt--;
        }
        System.out.println(cnt);
    }
}
