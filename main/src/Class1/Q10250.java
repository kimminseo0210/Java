package Class1;

import java.io.*;
import java.util.*;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i=0; i<testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()), w=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());

            if (n%h==0) System.out.println(h*100 + n/h);
            else System.out.println(n%h*100 + (n/h+1));
        }
    }
}
