package Class1;

import java.util.*;

public class Q2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int[] asc = {1,2,3,4,5,6,7,8};
         int[] desc = {8,7,6,5,4,3,2,1};
         int[] arr = new int[8];
         for (int i=0; i<8; i++) {
         	arr[i] = sc.nextInt();
         }
         if (Arrays.equals(arr, asc)) {
         	System.out.println("ascending");
         } else if (Arrays.equals(arr, desc)) {
         	System.out.println("descending");
         } else {
         	System.out.println("mixed");
         }
    }
}
