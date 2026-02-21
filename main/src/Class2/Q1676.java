package Class2;
import java.util.*;
import java.io.*;
public class Q1676 /* 팩토리얼 0의 개수 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = (n/5) + (n/25) + (n/125);
        System.out.println(count);

    }
}
/*
해당 문제는 팩토리얼이 아닌 수학을 이용하는 문제
13!은 62억으로 int범위를 벗어나고 500!은 0이 천개 넘게 붙어있는 숫자라 long으로도 감당불가 X
끝에 0이 붙으려면 10을 한번곱해야함 10=2x5 이며 이를 이용하여 문제를 풀어야함
2의 배수는 매우많지만 5의 배수는 상대적으로 적기 때문에 5의 배수를 이용하여 문제를 해결해야함
n=500인 경우
1. 5의 배수 : 5,10,15,... 500/5 = 100개
2. 25의 배수 : 25,50,75,... 500/25 = 20개
3. 125의 배수 : 125,250,... 500/125 = 4개
124개의 0을 가짐
*/

