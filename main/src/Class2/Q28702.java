package Class2;

import java.io.*;

public class Q28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[3];
        for (int i=0; i<3; i++) {
            str[i] = br.readLine();
        }
        int targetNum = 0;
        for (int i=0; i<3; i++) {
            char firstChar = str[i].charAt(0);
            if (firstChar >= '0' && firstChar <= '9') {
                int currentNum = Integer.parseInt(str[i]);
                targetNum = currentNum + (3-i);
                break;
            }
        }
        if (targetNum % 3 == 0 && targetNum % 5 == 0) System.out.println("FizzBuzz");
        else if (targetNum % 3 == 0) System.out.println("Fizz");
        else if (targetNum % 5 == 0) System.out.println("Buzz");
        else System.out.println(targetNum);
    }
}
