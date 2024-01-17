package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11005 {
    public static void main(String[] args) throws IOException {
        // 숫자와 진법을 입력받아 저장한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 10진수를 B진법을 변환하는 Integer.toString 메서드를 사용하여 출력한다
        String result = Integer.toString(number, B);
        result = result.toUpperCase();

        bw.write(result + "\n");
        br.close();
        bw.close();
    }
}
