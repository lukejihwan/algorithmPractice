package BaekJoon;

import java.io.*;

public class Q15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(N * (N - 1) + "\n");
        br.close();
        bw.close();

    }
}
