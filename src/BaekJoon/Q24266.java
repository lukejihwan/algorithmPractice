package BaekJoon;

import java.io.*;

public class Q24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Integer.parseInt(br.readLine());

        bw.write(N * N * N + "\n");
        bw.write(3 + "");

        br.close();
        bw.close();
    }
}
