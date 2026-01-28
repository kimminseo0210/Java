import java.util.*;
public class Main {
    public static void main(String[] args) {
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
        int numCount = sc.nextInt();
        String numChar = sc.next();
        int numSum = 0;

        for (int i = 0; i < numCount; i++) {
            numSum += numChar.charAt(i);
        }
        System.out.println(numSum);
        sc.close();
    }
}