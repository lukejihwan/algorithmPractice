package BaekJoon;

import java.io.*;

public class Q24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long count = Integer.parseInt(br.readLine());

        bw.write(count * count + "\n");
        bw.write(2 + "");
        br.close();
        bw.close();
    }
}
