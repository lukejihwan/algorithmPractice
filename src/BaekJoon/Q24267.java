package BaekJoon;

import java.io.*;

public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 3 -> 1, 1, 1 = 1
        // 4 -> 2, 2!, 2! = 8
        // 5 -> 3, 3!, 3! = 18
        long rep = N * 5;
        bw.write(rep + "\n");
        bw.write(3 + "");

        br.close();
        bw.close();
    }
}
