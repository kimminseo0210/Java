package Class2;

import java.util.*;
import java.io.*;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        double result = 0;
        String[] num =  br.readLine().split(" ");
        for (String s : num) {
            if (Integer.parseInt(s) > max) max = Integer.parseInt(s);
        }
        for (int i=0; i<n; i++) {
            result += Double.parseDouble(num[i])/max*100;
        }
        System.out.println(result/n);
    }
}
