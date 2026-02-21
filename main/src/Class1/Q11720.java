package Class1;

import java.util.*;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        String numChar = sc.next();
        int numSum = 0;

        for (int i = 0; i < numCount; i++) {
            numSum += numChar.charAt(i)-'0';
        }
        System.out.println(numSum);
    }
}
