package Class1;

import java.util.*;
import java.io.*;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
           int r = sc.nextInt();
           String p = sc.next();

           for (int j=0; j<p.length(); j++) {
               for (int k=0; k<r; k++) {
                   System.out.print(p.charAt(j));
               }
           }
        }
    }
}
