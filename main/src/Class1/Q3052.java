package Class1;

import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			int n = sc.nextInt();
			arr[i] = n % 42;
		}
		System.out.println(Arrays.stream(arr).distinct().count());
    }
}
