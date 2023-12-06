package BaekJoon;

import java.io.*;

public class Q2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetition = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < repetition; i++){
            sb.append(" ".repeat((repetition - i) - 1));
            sb.append("*".repeat((i + 1) * 2 - 1 ) + "\n");
        }

        for(int i = repetition - 1; i > 0; i--){
            sb.append(" ".repeat(repetition - i));
            sb.append("*".repeat(i * 2 - 1) + "\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
