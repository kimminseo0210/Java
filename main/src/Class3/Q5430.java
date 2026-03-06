package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            String command = br.readLine();
            int arrSize = Integer.parseInt(br.readLine());
            int[] arr = new int[arrSize];
            // []에서 숫자 추출
            String arrLine = br.readLine();
            String core = arrLine.substring(1, arrLine.length() - 1);


        }
    }
}
