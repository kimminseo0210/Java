package Class1;

import java.util.*;
import java.io.*;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int i=0; i<testCase; i++) {
			String str = br.readLine();
//         풀이법 1
			for (int j=0; j<str.length(); j++) {
				int sum = 0;
				int score = 0;
				if (str.charAt(j) == 'O') {
					score += 1;
					sum += score;
				} else {
					score = 0;
				}
			}
//         풀이법 2 (배열방식 : toCharArray 활용)
			char[] arr = str.toCharArray();
			int sum = 0;
			int score = 0;
			for (char ch : arr) {
				if (ch == 'O') {
					score++;
					sum += score;
				} else {
					score = 0;
				}
			}
			System.out.println(sum);
//         풀이법 3 ( 리스트/문자열 쪼개기 방식 : split 활용)
			String[] clusters = str.split("X");
			int totalSum = 0;
			for (String s : clusters) {
				int len = s.length();
				totalSum += (len * (len + 1)) / 2;
			}
			System.out.println(totalSum);
		}
    }
}
