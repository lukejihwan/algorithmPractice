package BaekJoon;

import java.io.*;

public class Q27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int width = Integer.parseInt(br.readLine());
        int length = Integer.parseInt(br.readLine());

        bw.write(width * length + "\n");
        br.close();
        bw.close();
    }
}
