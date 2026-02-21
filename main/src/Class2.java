import java.util.*;
import java.io.*;

public class Class2 {
    // Q11050
//    static int factorial(int n) {
//        if (n <= 1) return 1;
//        return n * factorial(n-1);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Q4153
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            if (a==0 && b==0 && c==0) break;
//            long A = a*a;
//            long B = b*b;
//            long C = c*c;
//            String result = ((A+B==C)||(A+C==B)||(B+C==A)) ? "right" : "wrong";
//            System.out.println(result);
//        }

        // Q30802
//        // 참가자 n, 사이즈 6개(S~3XL), 묶음수 T(티),P(펜)
//        // 스캐너와 버퍼리더를 같이쓰면 NullPointer 에러가 난다
//        int n = Integer.parseInt(br.readLine());
//        int[] sizeArr = new int[6];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i=0; i<6; i++) sizeArr[i] = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int t = Integer.parseInt(st.nextToken());
//        int p = Integer.parseInt(st.nextToken());
//        // 티
//        int count = 0; // 티 묶음 수
// //       for (int val : sizeArr) {
// //           count += val/t;
// //           if (val%t != 0) count++;    // 이것도 틀린 계산식은 아님
// //           // (val + t - 1) / t 수식을 이용하여 하나의 줄로 코드를 작성 할 수 있음 (코드 최적화)
// //       }
//        for (int val : sizeArr) count += (val+t-1)/t;
//        System.out.println(count);
//        System.out.println(n/p+" "+n%p); // 펜 (묶음 + 개별)

        // Q1978
//        int n = Integer.parseInt(br.readLine());    // 숫자의 개수 입력
//        int[] arr = new int[n];
//        int count = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i=0; i<n; i++) {
//            int val = Integer.parseInt(st.nextToken());
//            if (val==1) continue;
//            boolean isPrime = true; // 일단 소수라고 가정
//            for (int j=2; j<val; j++) {
//                if (val%j==0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) count++; // = (isPrime == true)와 같은 뜻으로 생략함
//        }
//        System.out.println(count);

        // Q2231
//        int n = Integer.parseInt(br.readLine());
//        int result = 0;
//        int start = n-(String.valueOf(n).length()*9); // 시작점이 1이 아닌 각 자릿수 최솟값(3자리:9*3=27)
//        if (start < 0) start = 0; // n이 작을 때 음수가 되는 것 방지(0인 이유: 음수만 아니면 됨)
//        // "자연수"라고 했으므로 1로 초기화해도 문제 없음
//        // 1. 1부터 n까지 하나씩 검사(가장 작은 수 : 1부터 시작)
//        for (int i = start; i < n; i++) {
//            int number = i;
//            int sum = 0;
//            // 2. 각 자릿수 다 더하기
//            while (number != 0) {
//                sum += number % 10; // 마지막 자릿수 추출
//                number = number / 10;   // 마지막 자릿수 제거
//            }
//            // 3. (원래 숫자 + 자릿수 합)이 n과 같은지 확인
//            if (sum + i == n) {
//                result = i;
//                break;  // 가장 작은 생성자를 찾으면 바로 종료
//            }
//        }
//        System.out.println(result);

        //Q2292
//        int n = Integer.parseInt(br.readLine()); // 방 번호
//        // 1 -(+1/+6)-> 2~7(2F) -(+6/+12)-> 8~19(3F) -(+12/+18)-> 20~37(4F) -(+18/+24)->38
//        int floor = 1;
//        int current_floor = 1;
//        while (n>current_floor) {       // 방 번호가 current_floor보다 클 때 까지
//            current_floor += 6*floor;   // 층의 마지막번호 업데이트
//            floor++;                    // 층 +1
//        }
//        System.out.println(floor);

        // Q2798
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());   // 카드의 개수
//        int m = Integer.parseInt(st.nextToken());   // 최대값
//
//        st = new StringTokenizer(br.readLine()); // 재할당 :
//        int[] numArr = new int[n];
//
//        // !*!*핵심*!*!
//        for (int i=0; i<n; i++) {
//            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
//            numArr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int sum = 0;        // 최대값 저장
//        int totalSum = 0;   // 근사치 저장
//        for (int i=0; i<=n-2; i++) {
//            for (int j=i+1; j<n-1; j++) {
//                for (int k=j+1; k<n; k++ ) {
//                    sum = numArr[i] + numArr[j] + numArr[k]; // 3수 더하기
//                    if (sum == m) {
//                        System.out.println(sum);
//                        return; // return(함수(프로그램)종료) break(반복문 하나 탈출)
//                    }
//                    if (sum > totalSum && sum <= m) totalSum = sum;
//                }
//            }
//        }
//        System.out.println(totalSum);

        // Q15829
//        int r = 31;
//        int mod = 1234567891;
//
//        // mod 값에 pow(약 10억이라고 가정)곱하면 310억이 됨
//        // int에 담기엔 너무 작은 그릇으로 long으로 변환 -> 100점
//        long hashResult = 0;
//        long pow = 1;
//
//        int n = Integer.parseInt(br.readLine());
//        String str = br.readLine();
//
//        for (int i=0; i<n; i++) {
//            int num = str.charAt(i)-'a'+1;
//            // 공식 (문자값 * 31^i) % M
//            hashResult += (num * pow) % mod;
//            hashResult %= mod;
//            pow = (pow * r) % mod;
//        }
//        System.out.println(hashResult);

        // Q1259
//        while (true) {
//            String str = br.readLine();
//            if (str.equals("0")) break;
//            String reverseStr = new StringBuilder(str).reverse().toString();
//            // 삼항 연산자를 이용하여 결과값을 바로 저장
//            String result = str.equals(reverseStr) ? "yes" : "no";
//            System.out.println(result);
//        }

        // Q1546
//        int n = Integer.parseInt(br.readLine());
//        int max = 0;
//        double result = 0;
//        String[] num =  br.readLine().split(" ");
//        for (String s : num) {
//            if (Integer.parseInt(s) > max) max = Integer.parseInt(s);
//        }
//        for (int i=0; i<n; i++) {
//            result += Double.parseDouble(num[i])/max*100;
//        }
//        System.out.println(result/n);

        // Q2609
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        // 이후 LCM을 구하기 위해 원래 값 복사 (중요)
//        int a = Math.max(n, m); // 큰 수
//        int b = Math.min(n, m); // 작은 수
//        public static int GCD(int a, int b) {
//            while (b != 0) {
//                int r = a % b;
//                a = b;
//                b = r;
//            }
//            return a;
//        }
//        // 반복문이 끝나면 a가 GCD
//        int gcd = GCD(a,b);
//        // LCM 구하기 : (원 수자 두 개 곱) / GCD
//        int lcm = (n*m)/gcd;
//        System.out.println(gcd);
//        System.out.println(lcm);

        // Q2775
//        int[][] apt = new int[15][15];  // 0~14층 1~14호 넉넉히 15x15
//        for (int i=1; i<15; i++) apt[0][i] = i; // 0층 i호는 i명이 산다
//        // 미리 채워놓기
//        for (int i=1; i<15; i++) {
//            for (int j=1; j<15; j++) {
//                // 공식 : 우리집 = 옆집 + 아랫집
//                apt[i][j] = apt[i][j-1]+apt[i-1][j];
//            }
//        }
//        int testcase = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i<testcase; i++) {
//            int k = Integer.parseInt(br.readLine());
//            int n = Integer.parseInt(br.readLine());
//            //System.out.println(apt[k][n]);
//            sb.append(apt[k][n]).append("\n");
//        }
//        System.out.println(sb);

        // Q2869
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        /**
//         * 내가 생각한 공식 :
//         * 낮동안 올라갈 거리를 미리 뺌(V-A) -> 남은 거리를 나눠서 날짜 구하기 -> 나머지가 남으면 날짜 ++ (달팽이가 움직이는 실제상황을 그대로 코드로 옮김)
//         * (v-a)/(a-b)+1
//         * 수학적 공식 : 내가 생각한 공식을 통분함 -> (v-b)/(a-b)
//        **/
//        // A B V : 낮 밤 높이
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());
//        // 하루동안 올라갈 수 있는 높이
//        int dayClimb = a-b;
//        // 마지막 날 밤에는 미끄러지지 않으므로
//        // 목표 높이(v)에서 밤에 미끄러지는 값(b)를 뺀 값을 하루 이동 거리로 나눔
//        int days = (v-b)/dayClimb;
//        // 나눠떨어지면 낮에 도착 or 나머지가 있으면 하루+
//        if ((v-b)%dayClimb != 0) days++;
//        System.out.println(days);

        // Q10989
//        int n = Integer.parseInt(br.readLine());
//        int[] numArr = new int[10001]; // 범위가 10,000이므로 10001 배열 생성
//        for (int i=0; i<n; i++) {
//            int num = Integer.parseInt(br.readLine());
//            numArr[num]++;  // 해당 숫자가 들어오면 +1
//        }
//        StringBuilder sb = new StringBuilder(); // for문으로 출력하면 시간오류로 StringBuilder로 조립하여 한번에 출력
//        for (int i=0; i<10001; i++) {
//            while (numArr[i] > 0) { // if문으로 하면 하나씩만 출력을 하므로 while문으로 해당 숫자가 0이 될때까지 sb에 조립
//                sb.append(i).append("\n");
//                numArr[i]--;
//            }
//        }
//        System.out.println(sb);

        // Q11050
        // 이항계수 : n개에서 순서 없이 r개를 선택하는 조합의 수
        // (n k) = n! / r!(n-r)!
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        int binomialCoefficient = 0;
//        binomialCoefficient = factorial(n) / (factorial(k)*factorial(n-k));
//        System.out.println(binomialCoefficient);

        // Q14626
//        int[] isbnArr = new int[13];
//        String numStr = br.readLine();
//        int starIndex = 0;
//        int checkNumber = 0;
//        int sum = 0;
//        for (int i = 0; i < 13; i++) {
//            char c = numStr.charAt(i);
//            int num = c - '0';
//            if (c == '*') {
//                starIndex = i;
//            }
//            else {
//                sum += (i%2!=0) ? num*3 : num;
//            }
//        }
//        for (int i=0; i<=9; i++) {
//            int weight = (starIndex%2==0) ? 1 : 3;
//            int totalSum = sum + (i*weight);
//            if (totalSum%10 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        // Q28702
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
