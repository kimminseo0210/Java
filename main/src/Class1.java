import java.io.*;
import java.util.*;

public class Class1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		// Q11654
//

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
//        int n = Integer.parseInt(br.readLine());    // 숫자 개수
//        // N 개의 정수 입력
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        // 최대 최소 -1,000,000~1,000,000
//        // 또는 첫 번째 값으로 초기화
//        int max = -1000001;
//        int min = 1000001;
//
//        for (int i=0; i<n; i++) {
//            int now = Integer.parseInt(st.nextToken());
//            // [실습 포인트] 삼항 연산자 사용
//            max = (now > max) ? now : max;
//            min = (now < min) ? now : min;
//        }
//        System.out.println(min + " " + max);

		// Q1152
		// 방법 1
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        System.out.println(st.countTokens());
		// 방법 2
//        String str = sc.nextLine();
//        int cnt = 0;
//
//        for (int i=0; i<str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                cnt++;
//            }
//        }
//        if (str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ') {
//            cnt++;
//        }
//        if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
//            cnt--;
//        }
//        System.out.println(cnt);

		// Q2577
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int[] arr = new int[10];
//        String num = String.valueOf(a*b*c);
//
//        for (int i=0; i<10; i++) {
//            int count = 0;
//            for (int j=0; j<num.length(); j++) {
//                if (num.charAt(j)-'0' == i) count++;
//            }
//            System.out.println(count);
//        }
		// 방법 2
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        int c = Integer.parseInt(br.readLine());
//        String num = String.valueOf(a*b*c);
//        for (int i=0; i<10; i++) {
//            int count = 0;
//            for (int j=0; j<num.length(); j++) {
//                if (num.charAt(j)-'0' == i) count++;
//            }
//            System.out.println(count);
//        }

		// Q2675
//        int n = sc.nextInt();
//        for (int i=0; i<n; i++) {
//           int r = sc.nextInt();
//           String p = sc.next();
//
//           for (int j=0; j<p.length(); j++) {
//               for (int k=0; k<r; k++) {
//                   System.out.print(p.charAt(j));
//               }
//           }
//        }

		// Q2920
		// int[] asc = {1,2,3,4,5,6,7,8};
		// int[] desc = {8,7,6,5,4,3,2,1};
		// int[] arr = new int[8];
		// for (int i=0; i<8; i++) {
		// 	arr[i] = sc.nextInt();
		// }
		// if (Arrays.equals(arr, asc)) {
		// 	System.out.println("ascending");
		// } else if (Arrays.equals(arr, desc)) {
		// 	System.out.println("descending");
		// } else {
		// 	System.out.println("mixed");
		// }

		// Q3052
//		int[] arr = new int[10];
//		for (int i=0; i<arr.length; i++) {
//			int n = sc.nextInt();
//			arr[i] = n % 42;
//		}
//		System.out.println(Arrays.stream(arr).distinct().count());

		// Q8958
		// 풀이법 1
//		int testCase = sc.nextInt();
//		for (int i=0; i<testCase; i++) {
//			String str = br.readLine();
		// 풀이법 1
//			for (int j=0; j<str.length(); j++) {
//				int sum = 0;
//				int score = 0;
//				if (str.charAt(j) == 'O') {
//					score += 1;
//					sum += score;
//				} else {
//					score = 0;
//				}
//			}
		// 풀이법 2 (배열방식 : toCharArray 활용)
//			char[] arr = str.toCharArray();
//			int sum = 0;
//			int score = 0;
//			for (char ch : arr) {
//				if (ch == 'O') {
//					score++;
//					sum += score;
//				} else {
//					score = 0;
//				}
//			}
//			System.out.println(sum);
		// 풀이법 3 ( 리스트/문자열 쪼개기 방식 : split 활용)
//			String[] clusters = str.split("X");
//			int totalSum = 0;
//			for (String s : clusters) {
//				int len = s.length();
//				totalSum += (len * (len + 1)) / 2;
//			}
//			System.out.println(totalSum);
//		}

		// Q10809
//		int[] arr = new int[26];
//		String str = br.readLine();
//		Arrays.fill(arr, -1);	// 배열의 모든 값을 -1로 지정
//		for (int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			if (arr[ch-'a'] == -1) arr[ch-'a'] = i;
//		}
//		for (int val : arr) {
//			sb.append(val).append(" ");
//		}
//		System.out.println(sb.toString().trim());

		// Q31403
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String s = "";	// 빈문자열 생성
		// s += (char)a의 의미 a의 아스키코드 값을 가져와서 더해라
		s += a;	// ""에 a가 자동형변환이 되어 문자로 취급되 더해짐 -> "3"
		s += b;	// "3"에 b가 자동형변환이 되어 문자로 취급되 더해짐 -> "34"

		System.out.println(a+b-c);
		System.out.println(Integer.parseInt(s)-c);
        sc.close();
    }
}
