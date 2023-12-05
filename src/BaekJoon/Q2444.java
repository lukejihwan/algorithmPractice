package BaekJoon;

import java.io.*;

public class Q2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetition = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < repetition * 2 - 1; i++){
            if(i < repetition){
                sb.append(" ".repeat((repetition - i) - 1));
                sb.append("*".repeat((i + 1) * 2 - 1 ) + "\n");
            }

            if(i >= repetition){
                sb.append(" ".repeat((i - repetition) + 1));
                sb.append("*".repeat((repetition * 2 - i) + (repetition - i) + 2) + "\n");
            }
        }

        bw.write(sb.toString() + "\n");
        br.close();
        bw.close();
    }
}
