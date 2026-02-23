package Class2;

import java.io.*;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * 설탕은 3,5kg 봉지가 있음
         * 최대한 적은 봉지 수를 옮기려고 함
         * ex) 18 = 5*3 + 3+1 (총 4봉)
         * 정확하게 배달이 안된다면 -1 출력
         */
        int n = Integer.parseInt(br.readLine());
        int sugarCount = 0;

        while (n >= 0) {
            if (n%5 == 0) {
                sugarCount += n/5;
                System.out.println(sugarCount);
                break;
            }
            n -= 3;
            sugarCount++;
        }
        if (n < 0) System.out.println(-1);
    }
}
