package BaekJoon;

import java.io.*;

public class Q24262 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*MenOfPassion(A[], n) {
            i = ⌊n / 2⌋;
            return A[i]; # 코드1
        }*/

        //위 식의 수행 횟수는 언제나 한 번이다.

        int inputNum = Integer.parseInt(br.readLine());

        bw.write(1 + "\n");
        bw.write(0 + "");
        br.close();
        bw.close();

    }
}
