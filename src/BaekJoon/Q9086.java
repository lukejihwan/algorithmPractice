package BaekJoon;

import java.io.*;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetition = Integer.parseInt(br.readLine());

        for(int i = 0; i < repetition; i++){
            String word = br.readLine();
            bw.write(String.valueOf(word.charAt(0)) + word.charAt(word.length() - 1) + "\n");
        }

        br.close();
        bw.close();
    }
}
