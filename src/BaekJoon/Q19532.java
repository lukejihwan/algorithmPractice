package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //두개의 연립 방정식을 모두 더한다.

        //x에 -999 부터 999까지 대입하면서 y가 정수로 출력되는 경우

        //x와 y를 출력한다.
        // 두 방정식을 더한 후, x 를 구합니다.
        int x = (c * e - b * f) / (a * e - b * d);
        // 두 방정식 중 하나를 선택하여 y 를 구합니다.
        int y = (c - a * x) / b;

        bw.write(x + " " + y + "\n");
        br.close();
        bw.close();
    }
}
