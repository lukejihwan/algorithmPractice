package BaekJoon;

import java.io.*;
import java.nio.Buffer;

public class Q15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정사각형이 1 -> 4, 2 -> 8, 3 -> 12, 4 -> 16

        long squareEa = Integer.parseInt(br.readLine());

        bw.write(squareEa * 4 + "\n");
        br.close();
        bw.close();

    }
}
