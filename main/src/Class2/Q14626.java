package Class2;

import java.io.*;

public class Q14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] isbnArr = new int[13];
        String numStr = br.readLine();
        int starIndex = 0;
        int checkNumber = 0;
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            char c = numStr.charAt(i);
            int num = c - '0';
            if (c == '*') {
                starIndex = i;
            }
            else {
                sum += (i%2!=0) ? num*3 : num;
            }
        }
        for (int i=0; i<=9; i++) {
            int weight = (starIndex%2==0) ? 1 : 3;
            int totalSum = sum + (i*weight);
            if (totalSum%10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
