package Class1;

import java.util.*;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m>=45) m -= 45;
        else {
            m = 60+(m-45);
            if (h==0) h=23;
            else h--;
        }
        System.out.println(h+" "+m);
    }
}
