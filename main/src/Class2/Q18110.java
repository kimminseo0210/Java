package Class2;

import java.io.*;
import java.util.*;

public class Q18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0)  System.out.println("0");
        else {

            int[] list = new int[n];

            for (int i = 0; i < n; i++) {
                list[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(list);

            int cutline = (int) Math.round(n * 0.15);
            int listLen = list.length - cutline - cutline;
            int sum = 0;
            for (int i = cutline; i < n - cutline; i++) {
                sum += list[i];
            }
            System.out.println(Math.round((double) sum / listLen));
        }
    }
}
