package BaekJoon;

import java.io.*;

public class Q11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        char ch = a.charAt(0);
        bw.write((int)ch + "\n");
        br.close();
        bw.close();
    }
}
