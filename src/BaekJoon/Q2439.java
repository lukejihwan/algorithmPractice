package BaekJoon;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repitition = Integer.parseInt(br.readLine());

        for(int i = 0; i < repitition; i++){
            bw.write(" ".repeat(repitition-(i+1)));
            bw.write("*".repeat(i+1) + "\n");
        }
        br.close();
        bw.close();
    }
}
