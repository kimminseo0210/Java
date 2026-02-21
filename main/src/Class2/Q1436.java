package Class2;
import java.util.*;
import java.io.*;
public class Q1436 /* 영화감독 숌 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;
        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }
        System.out.println(num);
    }
}
/*
브루트포스 문제
666부터 1씩 더하면서 원하는 순서의 666이 나올때까지 계속 더하면서 찾음
이떄 숫자를 String.valueOf로 문자로 전환하여 contains로 666이 있는지 찾고
찾을때마다 count르 증가시킴
*/

