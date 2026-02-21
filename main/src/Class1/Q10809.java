package Class1;

import java.util.*;
import java.io.*;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

		int[] arr = new int[26];
		String str = br.readLine();
		Arrays.fill(arr, -1);	// 배열의 모든 값을 -1로 지정
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (arr[ch-'a'] == -1) arr[ch-'a'] = i;
		}
		for (int val : arr) {
			sb.append(val).append(" ");
		}
		System.out.println(sb.toString().trim());
    }
}
