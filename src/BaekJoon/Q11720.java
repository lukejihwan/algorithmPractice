package BaekJoon;

import java.io.*;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetition = Integer.parseInt(br.readLine());
        int sum = 0;
        String numbers = br.readLine();

        for(int i = 0; i < repetition; i++){
            sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        bw.write(sum + "\n");
        br.close();
        bw.close();
    }
}
