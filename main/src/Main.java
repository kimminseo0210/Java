import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Q2438
//        int n;
//        n = sc.nextInt();
//
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();

        // Q1330
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a < b){
//            System.out.println("<");
//        } else if (a>b) {
//            System.out.println(">");
//        } else {
//            System.out.println("==");
//        }

        //Q2739
//        int n = sc.nextInt();
//        for(int i=1;i<10;i++){
//            System.out.println(n+" * "+i+" = "+(n*i));
//        }

        // Q10952
//        while (true) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if (a == 0 && b == 0) {
//                break;
//            }
//            System.out.println( a + b);
//        }

        // Q11654
//        int s = sc.next().charAt(0);
//        System.out.println(s);

        // Q2439
//        int n = sc.nextInt();
//        for (int i=0; i<n ;i++) {
//            for (int j=n-1; j>i; j--) {
//                System.out.print(" ");
//            }
//            for (int k=0; k<=i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Q11720
//        int numCount = sc.nextInt();
//        String numChar = sc.next();
//        int numSum = 0;
//
//        for (int i = 0; i < numCount; i++) {
//            numSum += numChar.charAt(i)-'0';
//        }
//        System.out.println(numSum);

        // Q2562
//        int max = 0;
//        int index = 0;
//        for (int i=0; i<9; i++) {
//            int n = sc.nextInt();
//            if (n > max) {
//                max = n;
//                index = i+1;
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);

        // Q2884
//        int h = sc.nextInt();
//        int m = sc.nextInt();
//        if (m>=45) m -= 45;
//        else {
//            m = 60+(m-45);
//            if (h==0) h=23;
//            else h--;
//        }
//        System.out.println(h+" "+m);

        // Q10250
//        int testCase = Integer.parseInt(br.readLine());
//        for (int i=0; i<testCase; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int h = Integer.parseInt(st.nextToken()), w=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());
//
//            if (n%h==0) System.out.println(h*100 + n/h);
//            else System.out.println(n%h*100 + (n/h+1));
//        }

        // Q10818
        int n = Integer.parseInt(br.readLine());    // 숫자 개수
        // N 개의 정수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 최대 최소 -1,000,000~1,000,000
        // 또는 첫 번째 값으로 초기화
        int max = -1000001;
        int min = 1000001;

        for (int i=0; i<n; i++) {
            int now = Integer.parseInt(st.nextToken());
            // [실습 포인트] 삼항 연산자 사용
            max = (now > max) ? now : max;
            min = (now < min) ? now : min;
        }
        System.out.println(min + " " + max);

        sc.close();
    }
}