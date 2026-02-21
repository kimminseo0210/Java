package Class2;
import java.util.*;
import java.io.*;
public class Q2751 /* 수 정렬하기 2 */ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 일반 배열을 이용하여 풀음 time : 4992ms
//        int[] numArr = new int[n];
//        for (int i=0; i<n; i++) {
//            numArr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(numArr);
//        for (int i : numArr) System.out.println(i);

        // ArrayList를 이용하여 최적화 time : 1344ms
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i : list) sb.append(i).append('\n');
        System.out.println(sb);
    }
}
