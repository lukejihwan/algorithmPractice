package BaekJoon;

import java.io.*;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int order = Integer.parseInt(br.readLine());

        //1번 방법
        String character = word.substring(order - 1, order);

        //2번 방법
        //word.charAt(order - 1);

        bw.write(character + "\n");
        br.close();
        bw.close();
    }
}
