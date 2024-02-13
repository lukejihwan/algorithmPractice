package BaekJoon;

import java.io.*;

public class Q24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // 6 5 4 3 2 1
        long sum = 0;

        for(int i = 1; i <= N - 1; i++){
            sum += i;
        }

        bw.write(sum + "\n");
        bw.write(2 + "");

        br.close();
        bw.close();


    }
}
