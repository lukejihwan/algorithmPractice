package BaekJoon;

import java.io.*;

public class Q2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        bw.write(word.length() + "\n");
        br.close();
        bw.close();
    }
}
